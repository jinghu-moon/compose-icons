package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighlighterCircle: ImageVector
    get() {
        if (_highlighterCircle != null) return _highlighterCircle!!
        _highlighterCircle = phosphorThinIcon(
            name = "HighlighterCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M198.71 57.29C173.485 31.843 136.573 21.837 101.949 31.06 67.326 40.283 40.283 67.326 31.06 101.949c-9.223 34.623 .783 71.535 26.23 96.761 25.225 25.447 62.137 35.453 96.761 26.23 34.623-9.223 61.666-36.266 70.889-70.889 9.223-34.623-.783-71.535-26.23-96.761ZM92 212.7v-60.7c0-2.209 1.791-4 4-4h64c2.209 0 4 1.791 4 4v60.7c-23.013 9.733-48.987 9.733-72 0ZM148 140h-40v-41.53l40-20ZM193.05 193.05c-6.224 6.241-13.314 11.556-21.05 15.78v-56.83c0-6.627-5.373-12-12-12h-4v-68c.001-1.387-.717-2.676-1.896-3.405-1.18-.729-2.653-.796-3.894-.175l-48 24C100.855 93.098 99.999 94.484 100 96v44h-4c-6.627 0-12 5.373-12 12v56.83C49.195 189.891 30.426 150.794 37.416 111.792 44.405 72.789 75.582 42.642 114.798 36.968c39.216-5.675 77.659 14.397 95.418 49.819 17.759 35.422 10.843 78.235-17.166 106.263Z"),
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
        return _highlighterCircle!!
    }

private var _highlighterCircle: ImageVector? = null
