package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorFillIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 76c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C103.699 164 84 144.301 84 120 84 95.699 103.699 76 128 76ZM176 64h48c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM215.87 88.46c-4.164 1.475-6.344 6.046-4.87 10.21 10.65 30.203 4.051 63.807-17.23 87.74C187.948 177.976 180.557 170.741 172 165.1c-1.501-.995-3.483-.864-4.84 .32-22.468 19.441-55.802 19.441-78.27 0-1.366-1.21-3.378-1.341-4.89-.32-8.566 5.636-15.965 12.871-21.79 21.31C39.221 160.504 33.565 123.523 47.762 91.931 61.958 60.339 93.365 40.012 128 40c4.919-.001 9.829 .407 14.68 1.22 4.336 .684 8.413-2.253 9.137-6.582 .724-4.329-2.175-8.433-6.497-9.198C99.115 17.675 53.429 41.796 33.779 84.329c-19.649 42.534-8.4 92.957 27.464 123.106 35.864 30.149 87.47 32.564 125.994 5.897 38.524-26.667 54.433-75.819 38.843-120.002-1.475-4.164-6.046-6.344-10.21-4.87Z"),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
