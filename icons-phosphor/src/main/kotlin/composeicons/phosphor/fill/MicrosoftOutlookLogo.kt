package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MicrosoftOutlookLogo: ImageVector
    get() {
        if (_microsoftOutlookLogo != null) return _microsoftOutlookLogo!!
        _microsoftOutlookLogo = phosphorFillIcon(
            name = "MicrosoftOutlookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 144c-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16ZM232 112v96c0 8.837-7.163 16-16 16h-128c-8.837 0-16-7.163-16-16v-16h-32c-8.837 0-16-7.163-16-16v-96C24 71.163 31.163 64 40 64h56v-24c0-4.418 3.582-8 8-8h96c4.418 0 8 3.582 8 8v64h16c4.418 0 8 3.582 8 8ZM112 64h24c8.837 0 16 7.163 16 16v74.13l40-28.89v-77.24h-80ZM88 160c17.673 0 32-14.327 32-32C120 110.327 105.673 96 88 96 70.327 96 56 110.327 56 128c0 17.673 14.327 32 32 32ZM199.26 208 152 173.87v2.13c0 8.837-7.163 16-16 16h-48v16ZM216 127.65 165.66 164 216 200.35Z"),
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
