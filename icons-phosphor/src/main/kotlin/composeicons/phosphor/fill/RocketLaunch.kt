package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorFillIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M101.85 191.14C97.34 201 82.29 224 40 224c-4.418 0-8-3.582-8-8 0-42.29 23-57.34 32.86-61.85 4.021-1.834 8.766-.061 10.6 3.96 1.834 4.021 .061 8.766-3.96 10.6-6.43 2.93-20.62 12.36-23.12 38.91 26.55-2.5 36-16.69 38.91-23.12 1.834-4.021 6.579-5.794 10.6-3.96 4.021 1.834 5.794 6.579 3.96 10.6ZM223.85 47.14c-.491-8.072-6.928-14.509-15-15-12.58-.75-44.73 .4-71.4 27.07h0L88 108.7c-3.123 3.129-8.191 3.133-11.32 .01-3.129-3.123-3.133-8.191-.01-11.32L103.23 70.82c1.137-1.144 1.476-2.858 .86-4.348-.616-1.49-2.067-2.465-3.68-2.472h-26.06C70.093 63.978 66.004 65.663 63 68.68L28.7 103c-4.29 4.287-5.788 10.632-3.866 16.386 1.921 5.753 6.931 9.925 12.936 10.774l38.47 5.37 44.21 44.21 5.37 38.49c.842 6.007 5.021 11.015 10.78 12.92 1.644 .549 3.366 .83 5.1 .83 4.24 .008 8.307-1.677 11.3-4.68L187.32 193c3.007-3.01 4.691-7.095 4.68-11.35v-26.06c-.003-1.617-.979-3.073-2.473-3.69-1.495-.617-3.214-.274-4.357 .87l-26.57 26.56c-1.571 1.572-3.725 2.421-5.947 2.341-2.221-.08-4.309-1.08-5.764-2.761-2.721-3.292-2.46-8.121 .6-11.1l49.27-49.27h0C223.45 91.86 224.6 59.71 223.85 47.12Z"),
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
        return _rocketLaunch!!
    }

private var _rocketLaunch: ImageVector? = null
