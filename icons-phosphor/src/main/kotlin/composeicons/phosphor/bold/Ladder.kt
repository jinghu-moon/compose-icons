package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ladder: ImageVector
    get() {
        if (_ladder != null) return _ladder!!
        _ladder = phosphorBoldIcon(
            name = "Ladder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.27 211.9 168.77 73l7.63-21h7.6c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-96c-6.378 .045-11.606 5.072-11.902 11.444-.295 6.371 4.445 11.861 10.792 12.496L28.73 211.94c-2.26 6.224 .949 13.102 7.17 15.37 1.315 .47 2.703 .704 4.1 .69 5.047 .001 9.556-3.157 11.28-7.9L60 196h38.5l-5.78 15.9c-2.259 6.227 .955 13.106 7.18 15.37 1.313 .485 2.701 .732 4.1 .73 5.047 .001 9.556-3.157 11.28-7.9L132.77 172h46.46l17.49 48.1c1.724 4.743 6.233 7.901 11.28 7.9 1.399 .001 2.787-.246 4.1-.73 6.221-2.268 9.43-9.146 7.17-15.37ZM124.69 124h-38.47L95 100h38.46ZM142.14 76h-38.46l8.73-24h38.46ZM68.77 172l8.73-24h38.5l-8.73 24ZM141.5 148 156 108.11 170.5 148Z"),
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
        return _ladder!!
    }

private var _ladder: ImageVector? = null
