package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PhoneCall: ImageVector
    get() {
        if (_phoneCall != null) return _phoneCall!!
        _phoneCall = phosphorFillIcon(
            name = "PhoneCall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144.27 45.93c.548-2.05 1.889-3.799 3.727-4.86 1.838-1.062 4.023-1.349 6.073-.8 30.198 7.879 53.781 31.462 61.66 61.66 .55 2.05 .262 4.235-.799 6.073-1.062 1.838-2.81 3.179-4.86 3.727-.676 .177-1.371 .268-2.07 .27-3.622 .001-6.793-2.431-7.73-5.93C193.847 81.414 174.595 62.158 149.94 55.73c-2.052-.546-3.803-1.886-4.867-3.724-1.064-1.838-1.353-4.024-.803-6.076ZM141.94 87.73c13.79 3.68 22.65 12.55 26.33 26.34 .937 3.499 4.108 5.931 7.73 5.93 .699-.002 1.394-.092 2.07-.27 2.05-.548 3.799-1.889 4.86-3.727 1.062-1.838 1.349-4.023 .799-6.073C178.61 90.77 165.23 77.39 146.07 72.27c-4.269-1.14-8.655 1.396-9.795 5.665-1.14 4.269 1.396 8.655 5.665 9.795ZM214.37 166.46 167.26 145.35l-.13-.06c-4.969-2.125-10.674-1.599-15.17 1.4-.261 .172-.511 .359-.75 .56L126.87 168C111.45 160.51 95.53 144.71 88.04 129.49l20.78-24.71c.2-.25 .39-.5 .57-.77 2.933-4.482 3.429-10.136 1.32-15.06v-.12L89.54 41.64C86.721 35.135 79.957 31.261 72.92 32.12 44.889 35.809 23.949 59.727 24 88c0 79.4 64.6 144 144 144 28.273 .051 52.191-20.889 55.88-48.92 .861-7.035-3.009-13.798-9.51-16.62Z"),
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
