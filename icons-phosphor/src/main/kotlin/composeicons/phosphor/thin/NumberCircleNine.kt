package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) return _numberCircleNine!!
        _numberCircleNine = phosphorThinIcon(
            name = "NumberCircleNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 80.29c-12.709-7.354-28.792-5.116-39.01 5.43-10.217 10.545-11.947 26.691-4.195 39.162 7.752 12.47 22.996 18.065 36.975 13.569L116.57 174c-1.13 1.895-.512 4.346 1.38 5.48 .603 .367 1.294 .564 2 .57 1.407-.002 2.709-.742 3.43-1.95L155.71 124C164.545 108.696 159.303 89.127 144 80.29ZM148.8 120l-.06 .09c-6.949 10.369-20.983 13.15-31.361 6.214-10.377-6.936-13.175-20.968-6.251-31.353 6.924-10.386 20.952-13.2 31.346-6.289 10.394 6.911 13.225 20.936 6.326 31.338ZM128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92Z"),
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
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
