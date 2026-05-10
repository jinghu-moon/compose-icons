package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FileJsx: ImageVector
    get() {
        if (_fileJsx != null) return _fileJsx!!
        _fileJsx = phosphorFillIcon(
            name = "FileJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.66 82.34l-56-56C156.158 24.84 154.122 23.998 152 24h-96C47.163 24 40 31.163 40 40v76c0 2.209 1.791 4 4 4h168c2.209 0 4-1.791 4-4v-28c.002-2.122-.84-4.158-2.34-5.66ZM152 88v-44l44 44ZM147.81 196.31c-.631 6.196-4.003 11.783-9.19 15.23C133.43 215 127 216 121.13 216c-5.128-.022-10.232-.694-15.19-2-4.255-1.19-6.74-5.605-5.55-9.86 1.19-4.255 5.605-6.74 9.86-5.55 4.38 1.21 15 2.71 19.55-.35 .88-.6 1.83-1.52 2.14-3.93 .34-2.67-.72-4.1-12.78-7.59-9.35-2.7-25-7.23-23-23.12 .637-6.068 3.934-11.54 9-14.94 11.85-8 30.72-3.31 32.84-2.76 4.275 1.124 6.829 5.5 5.705 9.775-1.124 4.275-5.5 6.829-9.775 5.705-4.49-1.17-15.23-2.56-19.83 .56-1.22 .829-1.965 2.196-2 3.67-.11 .9-.13 1.08 1.12 1.9 2.31 1.49 6.45 2.68 10.45 3.84 9.82 2.82 26.33 7.65 24.14 24.96ZM80 152v37.4c0 14.23-11.18 26.27-25.41 26.59-6.932 .158-13.64-2.459-18.633-7.27C30.964 203.909 28.1 197.303 28 190.37c-.128-4.273 3.059-7.922 7.31-8.37 2.277-.198 4.531 .587 6.191 2.158 1.661 1.571 2.57 3.777 2.499 6.062-.203 3.192 1.325 6.247 4 8 7.85 4.82 16-.76 16-8.2v-37.75c-.068-4.291 3.195-7.903 7.47-8.27 2.212-.147 4.386 .631 6.003 2.147 1.617 1.517 2.532 3.636 2.527 5.853ZM214.51 156.65 197.83 180l16.68 23.35c2.332 3.588 1.427 8.376-2.053 10.866-3.48 2.49-8.304 1.8-10.947-1.566L188 193.76l-13.49 18.89c-1.604 2.468-4.434 3.856-7.367 3.613-2.933-.243-5.497-2.076-6.673-4.774-1.177-2.698-.777-5.824 1.04-8.139L178.17 180 161.49 156.65c-2.332-3.588-1.427-8.376 2.053-10.866 3.48-2.49 8.304-1.8 10.947 1.566L188 166.24l13.49-18.89c2.643-3.366 7.466-4.056 10.947-1.566 3.48 2.49 4.385 7.278 2.053 10.866Z"),
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
        return _fileJsx!!
    }

private var _fileJsx: ImageVector? = null
