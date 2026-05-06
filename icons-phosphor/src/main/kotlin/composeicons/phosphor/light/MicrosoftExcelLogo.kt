package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MicrosoftExcelLogo: ImageVector
    get() {
        if (_microsoftExcelLogo != null) return _microsoftExcelLogo!!
        _microsoftExcelLogo = phosphorLightIcon(
            name = "MicrosoftExcelLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 26h-128C64.268 26 58 32.268 58 40v26h-18C32.268 66 26 72.268 26 80v96c0 7.732 6.268 14 14 14h18v26c0 7.732 6.268 14 14 14h128c7.732 0 14-6.268 14-14v-176c0-7.732-6.268-14-14-14ZM158 102h44v52h-44ZM202 40v50h-44v-10c0-7.732-6.268-14-14-14h-2v-28h58c1.105 0 2 .895 2 2ZM70 40c0-1.105 .895-2 2-2h58v28h-60ZM38 176v-96c0-1.105 .895-2 2-2h104c1.105 0 2 .895 2 2v96c0 1.105-.895 2-2 2h-104c-1.105 0-2-.895-2-2ZM70 216v-26h60v28h-58c-1.105 0-2-.895-2-2ZM200 218h-58v-28h2c7.732 0 14-6.268 14-14v-10h44v50c0 1.105-.895 2-2 2ZM67.39 148.16 84.19 128 67.39 107.84c-1.392-1.645-1.796-3.91-1.057-5.934 .739-2.024 2.507-3.497 4.631-3.858 2.125-.361 4.28 .445 5.646 2.112L92 118.63l15.39-18.47c2.129-2.515 5.888-2.842 8.419-.733 2.532 2.109 2.889 5.865 .801 8.413L99.81 128l16.8 20.16c1.392 1.645 1.796 3.91 1.057 5.934-.739 2.024-2.507 3.497-4.631 3.858-2.125 .361-4.28-.445-5.646-2.112L92 137.37 76.61 155.84c-2.129 2.515-5.888 2.842-8.419 .733-2.532-2.109-2.889-5.865-.801-8.413Z"),
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
        return _microsoftExcelLogo!!
    }

private var _microsoftExcelLogo: ImageVector? = null
