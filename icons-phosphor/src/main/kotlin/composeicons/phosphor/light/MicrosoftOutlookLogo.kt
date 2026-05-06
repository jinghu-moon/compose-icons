package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorLightIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M118 128C118 111.431 104.569 98 88 98 71.431 98 58 111.431 58 128c0 16.569 13.431 30 30 30 16.569 0 30-13.431 30-30ZM70 128c0-9.941 8.059-18 18-18 9.941 0 18 8.059 18 18 0 9.941-8.059 18-18 18-9.941 0-18-8.059-18-18ZM224 106h-18v-66c0-3.314-2.686-6-6-6h-96c-3.314 0-6 2.686-6 6v26h-58C32.268 66 26 72.268 26 80v96c0 7.732 6.268 14 14 14h34v18c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-96c0-3.314-2.686-6-6-6ZM162.25 164 218 123.73v80.54ZM110 46h84v80.27l-42 30.33-2-1.45v-75.15c0-7.732-6.268-14-14-14h-26ZM38 176v-96c0-1.105 .895-2 2-2h96c1.105 0 2 .895 2 2v96c0 1.105-.895 2-2 2h-96c-1.105 0-2-.895-2-2ZM86 208v-18h50c7.732 0 14-6.268 14-14v-6l55.44 40h-117.44c-1.105 0-2-.895-2-2Z"),
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
        return _microsoftOutlookLogo!!
    }

private var _microsoftOutlookLogo: ImageVector? = null
