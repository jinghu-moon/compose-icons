package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorLightIcon(
            name = "FileVue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M85.65 154l-20 56c-.853 2.387-3.115 3.981-5.65 3.981-2.535 0-4.797-1.593-5.65-3.981l-20-56c-.833-2.047-.474-4.386 .935-6.089 1.409-1.702 3.64-2.492 5.807-2.056 2.167 .437 3.918 2.029 4.558 4.144L60 190.16 74.35 150c1.209-2.969 4.538-4.463 7.559-3.394 3.022 1.07 4.669 4.326 3.741 7.394ZM208 158c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-32c-3.314 0-6 2.686-6 6v56c0 3.314 2.686 6 6 6h32c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-26v-16h18c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-18v-16ZM144 146c-3.314 0-6 2.686-6 6v38c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-38c0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6v38c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24v-38c0-3.314-2.686-6-6-6ZM214 88v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM193.52 82 158 46.48v35.52Z"),
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
