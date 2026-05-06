package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Phone: ImageVector
    get() {
        if (_phone != null) return _phone!!
        _phone = phosphorRegularIcon(
            name = "Phone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.37 158.46 175.26 137.35l-.13-.06c-4.969-2.125-10.674-1.599-15.17 1.4-.261 .172-.511 .359-.75 .56L134.87 160C119.45 152.51 103.53 136.71 96.04 121.49L116.82 96.78c.2-.25 .39-.5 .57-.77 2.933-4.482 3.429-10.136 1.32-15.06v-.12L97.54 33.64C94.721 27.135 87.957 23.261 80.92 24.12 52.889 27.809 31.949 51.727 32 80c0 79.4 64.6 144 144 144 28.273 .051 52.191-20.889 55.88-48.92 .861-7.035-3.009-13.798-9.51-16.62ZM176 208C105.34 207.923 48.077 150.66 48 80 47.922 59.799 62.847 42.678 82.87 40c-.004 .04-.004 .08 0 .12l21 47L83.2 111.86c-.21 .241-.4 .499-.57 .77-3.061 4.697-3.44 10.653-1 15.7 9.06 18.53 27.73 37.06 46.46 46.11 5.085 2.418 11.066 1.985 15.75-1.14 .257-.173 .504-.36 .74-.56L168.89 152l47 21.05h0c0 0 .08 0 .11 0-2.646 20.052-19.774 35.018-40 34.95Z"),
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
        return _phone!!
    }

private var _phone: ImageVector? = null
