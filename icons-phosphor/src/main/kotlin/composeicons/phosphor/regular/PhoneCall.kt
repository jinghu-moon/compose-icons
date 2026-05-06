package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorRegularIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144.27 45.93c.548-2.05 1.889-3.799 3.727-4.86 1.838-1.062 4.023-1.349 6.073-.8 30.198 7.879 53.781 31.462 61.66 61.66 .55 2.05 .262 4.235-.799 6.073-1.062 1.838-2.81 3.179-4.86 3.727-.676 .177-1.371 .268-2.07 .27-3.625-0-6.797-2.437-7.73-5.94C193.844 81.408 174.592 62.156 149.94 55.73c-2.052-.546-3.803-1.886-4.867-3.724-1.064-1.838-1.353-4.024-.803-6.076ZM141.94 87.73c13.79 3.68 22.65 12.54 26.33 26.33 .933 3.503 4.105 5.94 7.73 5.94 .699-.002 1.394-.092 2.07-.27 2.05-.548 3.799-1.889 4.86-3.727 1.062-1.838 1.349-4.023 .799-6.073C178.61 90.77 165.23 77.39 146.07 72.27c-4.269-1.14-8.655 1.396-9.795 5.665-1.14 4.269 1.396 8.655 5.665 9.795ZM223.88 183.08C220.191 211.111 196.273 232.051 168 232 88.6 232 24 167.4 24 88 23.949 59.727 44.889 35.809 72.92 32.12c7.037-.859 13.801 3.015 16.62 9.52l21.12 47.15v.12c2.134 4.925 1.658 10.591-1.27 15.09-.18 .27-.37 .52-.57 .77L88 129.45c7.49 15.22 23.41 31 38.83 38.51l24.34-20.71c.239-.201 .489-.388 .75-.56 4.496-2.999 10.201-3.525 15.17-1.4l.13 .06 47.11 21.11c6.517 2.809 10.405 9.575 9.55 16.62ZM208 181.08c0 0-.07 0-.11 0h0l-47-21.05-24.35 20.71c-.236 .2-.483 .387-.74 .56-4.684 3.125-10.665 3.558-15.75 1.14C101.32 173.39 82.65 154.86 73.59 136.33c-2.44-5.047-2.061-11.003 1-15.7 .17-.271 .36-.529 .57-.77L96 95.15l-21-47c-.004-.04-.004-.08 0-.12C54.937 50.647 39.946 67.767 40 88c.077 70.66 57.34 127.923 128 128 20.219 .069 37.345-14.886 40-34.93Z"),
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
        return _phoneCall!!
    }

private var _phoneCall: ImageVector? = null
