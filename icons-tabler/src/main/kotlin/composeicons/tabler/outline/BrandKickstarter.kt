package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandKickstarter: ImageVector
    get() {
        if (_brandKickstarter != null) return _brandKickstarter!!
        _brandKickstarter = tablerOutlineIcon(
            name = "BrandKickstarter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11 9 13.975 4.35C14.59 3.45 15.38 3 16.352 3c.79 0 1.474 .286 2.054 .858 .576 .574 .866 1.256 .866 2.054 0 .588-.153 1.109-.46 1.559L16 11.5l3.465 4.912c.356 .46 .535 1 .535 1.613 .012 .784-.292 1.54-.843 2.098-.561 .584-1.242 .877-2.04 .877-.876 0-1.545-.29-2-.87L11.005 14.433v3.067c0 .876-.313 1.69-.611 2.175C9.851 20.558 9.044 21 8.005 21c-.944 0-1.753-.327-2.271-.974-.486-.6-.729-1.392-.729-2.38v-11.371c0-.934 .247-1.706 .74-2.313C6.257 3.321 7.092 3 8.005 3c.868 0 1.821 .321 2.4 .962 .323 .356 .515 .714 .6 1.08 .052 .224 0 .643 0 1.26v2.698h-.005"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _brandKickstarter!!
    }

private var _brandKickstarter: ImageVector? = null
