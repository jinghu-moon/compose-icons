package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Radioactive: ImageVector
    get() {
        if (_radioactive != null) return _radioactive!!
        _radioactive = phosphorThinIcon(
            name = "Radioactive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M92 132h-52c-3.354-.015-6.549-1.433-8.81-3.91-2.305-2.526-3.444-5.904-3.14-9.31C30.704 89.603 46.043 63.065 70 46.2c2.753-1.937 6.194-2.629 9.482-1.906 3.288 .723 6.121 2.793 7.808 5.706l25.94 45c.994 1.899 .313 4.244-1.543 5.317-1.856 1.073-4.227 .492-5.377-1.317L80.36 54c-.562-.977-1.509-1.671-2.609-1.913-1.1-.242-2.252-.008-3.171 .643C52.545 68.247 38.439 92.66 36 119.5c-.104 1.171 .288 2.331 1.08 3.2 .743 .831 1.806 1.304 2.92 1.3h52c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4ZM228 118.78C225.334 89.594 209.976 63.055 186 46.2c-2.753-1.934-6.19-2.624-9.476-1.901-3.285 .722-6.117 2.791-7.804 5.701L142.77 95c-.994 1.899-.313 4.244 1.543 5.317 1.856 1.073 4.227 .492 5.377-1.317L175.64 54c.562-.977 1.509-1.671 2.609-1.913 1.1-.242 2.252-.008 3.171 .643 22.035 15.517 36.141 39.93 38.58 66.77 .104 1.171-.288 2.331-1.08 3.2-.743 .831-1.806 1.304-2.92 1.3h-52c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h52c3.354-.015 6.549-1.433 8.81-3.91 2.323-2.518 3.481-5.896 3.19-9.31ZM149.52 157.18c-1.105-1.914-3.551-2.57-5.465-1.465-1.914 1.105-2.57 3.551-1.465 5.465l25.82 44.73c.565 .976 .693 2.145 .35 3.22-.328 1.07-1.1 1.948-2.12 2.41-24.49 11.28-52.69 11.28-77.18 0-1.02-.462-1.792-1.34-2.12-2.41-.343-1.075-.215-2.244 .35-3.22l25.82-44.73c1.105-1.914 .449-4.36-1.465-5.465-1.914-1.105-4.36-.449-5.465 1.465L80.71 201.91c-1.686 2.917-2.068 6.409-1.052 9.622 1.016 3.213 3.335 5.85 6.392 7.268 26.622 12.267 57.278 12.267 83.9 0 3.057-1.418 5.376-4.056 6.392-7.268 1.016-3.213 .634-6.704-1.052-9.622ZM128 136c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8Z"),
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
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
