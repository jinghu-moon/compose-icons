package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RocketLaunch: ImageVector
    get() {
        if (_rocketLaunch != null) return _rocketLaunch!!
        _rocketLaunch = phosphorRegularIcon(
            name = "RocketLaunch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.85 47.12c-.491-8.072-6.928-14.509-15-15-12.58-.75-44.73 .4-71.41 27.07L132.69 64h-58.33C70.099 63.976 66.007 65.662 63 68.68L28.7 103c-4.29 4.287-5.788 10.632-3.866 16.386 1.921 5.753 6.931 9.925 12.936 10.774l38.47 5.37 44.21 44.21 5.37 38.49c.842 6.007 5.021 11.015 10.78 12.92 1.644 .549 3.366 .83 5.1 .83 4.24 .008 8.307-1.677 11.3-4.68L187.32 193c3.018-3.007 4.704-7.099 4.68-11.36v-58.33l4.77-4.77C223.45 91.86 224.6 59.71 223.85 47.12ZM74.36 80h42.33L77.16 119.52 40 114.34ZM148.77 70.55C164.322 54.903 185.861 46.715 207.88 48.08c1.418 22.032-6.756 43.602-22.42 59.16L128 164.68 91.32 128ZM176 181.64 141.67 216l-5.19-37.17L176 139.31ZM101.84 191.14C97.34 201 82.29 224 40 224c-4.418 0-8-3.582-8-8 0-42.29 23-57.34 32.86-61.85 4.021-1.834 8.766-.061 10.6 3.96 1.834 4.021 .061 8.766-3.96 10.6-6.43 2.93-20.62 12.36-23.12 38.91 26.55-2.5 36-16.69 38.91-23.12 1.834-4.021 6.579-5.794 10.6-3.96 4.021 1.834 5.794 6.579 3.96 10.6Z"),
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
