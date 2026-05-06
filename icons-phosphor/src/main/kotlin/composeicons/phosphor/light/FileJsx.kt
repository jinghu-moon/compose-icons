package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileJsx: ImageVector
    get() {
        if (_fileJsx != null) return _fileJsx!!
        _fileJsx = phosphorLightIcon(
            name = "FileJsx",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M145.83 196.05c-.569 5.613-3.617 10.679-8.31 13.81-4.82 3.19-10.87 4.14-16.36 4.14-4.958-.052-9.889-.723-14.68-2-3.192-.892-5.057-4.203-4.165-7.395 .892-3.192 4.203-5.057 7.395-4.165 3.71 1 15.58 3.11 21.19-.62 1.784-1.209 2.896-3.187 3-5.34 .58-4.43-2.08-6.26-14.2-9.76-9.31-2.69-23.37-6.75-21.57-20.94 .554-5.488 3.513-10.447 8.08-13.54 11.11-7.49 29.18-3 31.21-2.48 3.132 .904 4.969 4.143 4.138 7.295-.831 3.152-4.028 5.064-7.198 4.305-3.79-1-15.85-2.95-21.45 .84-1.699 1.152-2.764 3.031-2.88 5.08-.41 3.22 2.14 4.78 13 7.91 9.89 2.89 24.81 7.2 22.8 22.86ZM72 146c-3.314 0-6 2.686-6 6v38c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-3.314-2.686-6-6-6-3.314 0-6 2.686-6 6 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24v-38c0-3.314-2.686-6-6-6ZM211.49 147.12c-2.695-1.927-6.442-1.305-8.37 1.39L188 169.67 172.88 148.5c-1.933-2.695-5.685-3.313-8.38-1.38-2.695 1.933-3.313 5.685-1.38 8.38L180.63 180l-17.51 24.5c-1.933 2.695-1.315 6.447 1.38 8.38 2.695 1.933 6.447 1.315 8.38-1.38L188 190.31l15.12 21.16c1.933 2.695 5.685 3.313 8.38 1.38 2.695-1.933 3.313-5.685 1.38-8.38L195.37 180l17.51-24.51c.929-1.295 1.304-2.906 1.043-4.478-.261-1.572-1.136-2.976-2.433-3.902ZM214 88v24c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-18h-50c-3.314 0-6-2.686-6-6v-50h-90c-1.105 0-2 .895-2 2v72c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-72C42 32.268 48.268 26 56 26h96c1.594-.001 3.123 .632 4.25 1.76l56 56c1.122 1.126 1.751 2.651 1.75 4.24ZM193.51 82 158 46.48v35.52Z"),
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
