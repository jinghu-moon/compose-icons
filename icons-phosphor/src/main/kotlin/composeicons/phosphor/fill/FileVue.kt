package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorFillIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM87.36 155 67.47 210.69c-1.132 3.193-4.152 5.326-7.54 5.326-3.388 0-6.408-2.134-7.54-5.326L32.5 155c-1.548-4.127 .438-8.739 4.5-10.45 2.016-.792 4.267-.732 6.238 .165 1.971 .897 3.495 2.555 4.222 4.595l12.47 34.9L72.4 149.31c.727-2.04 2.251-3.698 4.222-4.595 1.971-.897 4.222-.957 6.238-.165 4.058 1.715 6.043 6.324 4.5 10.45ZM184 160v12h15.73c4.283-.053 7.884 3.203 8.26 7.47 .147 2.212-.631 4.386-2.147 6.003-1.516 1.617-3.636 2.532-5.853 2.527h-15.99v12h23.73c4.285-.058 7.888 3.201 8.26 7.47 .147 2.212-.631 4.386-2.147 6.003-1.516 1.617-3.636 2.532-5.853 2.527h-31.99c-4.418 0-8-3.582-8-8v-56c0-4.418 3.582-8 8-8h31.74c4.285-.058 7.888 3.201 8.26 7.47 .147 2.212-.631 4.386-2.147 6.003-1.517 1.617-3.636 2.532-5.853 2.527ZM152 152v37.45c0 14.14-11.07 26.12-25.22 26.54-7.028 .211-13.842-2.434-18.888-7.33C102.847 203.763 100 197.031 100 190v-37.73c-.053-4.281 3.205-7.879 7.47-8.25 2.214-.15 4.39 .626 6.009 2.143 1.619 1.517 2.536 3.638 2.531 5.857v37.65c-.076 5.33 3.953 9.825 9.26 10.33 2.776 .203 5.511-.76 7.548-2.658 2.036-1.898 3.19-4.559 3.182-7.342v-37.73c-.053-4.281 3.205-7.879 7.47-8.25 2.208-.147 4.379 .628 5.995 2.14 1.616 1.512 2.534 3.626 2.535 5.84Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
