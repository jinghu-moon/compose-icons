package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Percent: ImageVector
    get() {
        if (_percent != null) return _percent!!
        _percent = phosphorRegularIcon(
            name = "Percent",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M205.66 61.64l-144 144c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32L194.34 50.32c3.123-3.126 8.189-3.128 11.315-.005 3.126 3.123 3.128 8.189 .005 11.315ZM50.54 101.44C36.482 87.379 36.484 64.583 50.545 50.525c14.061-14.058 36.857-14.056 50.915 .005h0c14.058 14.061 14.056 36.857-.005 50.915-14.061 14.058-36.857 14.056-50.915-.005ZM56 76c.007 9.051 6.091 16.968 14.835 19.306 8.743 2.337 17.967-1.488 22.489-9.328C97.847 78.138 96.541 68.239 90.14 61.84h0C84.418 56.119 75.812 54.41 68.338 57.51 60.863 60.61 55.994 67.908 56 76ZM216 180c-.004 17.174-12.139 31.954-28.984 35.301-16.845 3.347-33.709-5.671-40.278-21.54-6.569-15.868-1.015-34.168 13.267-43.707 14.282-9.539 33.313-7.661 45.455 4.485h0c6.773 6.738 10.569 15.906 10.54 25.46ZM200 180c.002-9.542-6.736-17.756-16.094-19.619-9.358-1.863-18.729 3.143-22.382 11.958-3.653 8.815-.571 18.982 7.362 24.285 7.933 5.302 18.506 4.263 25.254-2.483 3.763-3.742 5.873-8.833 5.86-14.14Z"),
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
        return _percent!!
    }

private var _percent: ImageVector? = null
