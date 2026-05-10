package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Target: ImageVector
    get() {
        if (_target != null) return _target!!
        _target = phosphorFillIcon(
            name = "Target",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.87 83.16c22.993 48.089 5.946 105.778-39.493 133.645C136.939 244.672 77.791 233.714 45.351 191.419 12.911 149.123 17.662 89.157 56.356 52.496 95.05 15.835 155.186 14.326 195.67 49L218.34 26.32c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L167.6 99.71h0l-37.71 37.71-23.95 23.95c12.628 8.353 28.89 8.859 42.014 1.309 13.124-7.55 20.86-21.863 19.986-36.979-.249-4.418 3.132-8.201 7.55-8.45 4.418-.249 8.201 3.132 8.45 7.55 1.321 23.192-11.813 44.791-33.011 54.289-21.199 9.498-46.06 4.923-62.489-11.499h0C67.737 146.81 66.578 113.575 85.783 91.402c19.205-22.172 52.265-25.768 75.787-8.242L184.3 60.39C149.775 31.726 99.2 33.676 66.986 64.915 34.771 96.153 31.266 146.644 58.856 182.034c27.589 35.39 77.41 44.31 115.564 20.691 38.154-23.619 52.385-72.19 33.011-112.665-1.905-3.987-.217-8.765 3.77-10.67 3.988-1.905 8.765-.217 10.67 3.77Z"),
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
        return _target!!
    }

private var _target: ImageVector? = null
