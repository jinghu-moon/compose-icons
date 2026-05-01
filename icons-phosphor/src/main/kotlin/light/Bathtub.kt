package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bathtub: ImageVector
    get() {
        if (_bathtub != null) return _bathtub!!
        _bathtub = phosphorLightIcon(
            name = "Bathtub",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 98.0f),
                    PathNode.LineTo(206.0f, 98.0f),
                    PathNode.LineTo(206.0f, 96.0f),
                    PathNode.CurveTo(206.0f, 92.686295f, 203.3137f, 90.0f, 200.0f, 90.0f),
                    PathNode.LineTo(136.0f, 90.0f),
                    PathNode.CurveTo(132.6863f, 90.0f, 130.0f, 92.686295f, 130.0f, 96.0f),
                    PathNode.LineTo(130.0f, 98.0f),
                    PathNode.LineTo(62.0f, 98.0f),
                    PathNode.LineTo(62.0f, 52.0f),
                    PathNode.CurveTo(62.0f, 44.268013f, 68.26801f, 38.0f, 76.0f, 38.0f),
                    PathNode.CurveTo(82.737915f, 37.987595f, 88.59269f, 42.627457f, 90.12f, 49.19f),
                    PathNode.CurveTo(90.51525f, 51.320473f, 92.0285f, 53.072315f, 94.07888f, 53.773087f),
                    PathNode.CurveTo(96.12926f, 54.473858f, 98.398186f, 54.01467f, 100.014725f, 52.571785f),
                    PathNode.CurveTo(101.63127f, 51.1289f, 102.34425f, 48.92651f, 101.88f, 46.81f),
                    PathNode.CurveTo(99.27035f, 34.61963f, 88.466385f, 25.932207f, 76.0f, 26.0f),
                    PathNode.CurveTo(61.6406f, 26.0f, 50.0f, 37.6406f, 50.0f, 52.0f),
                    PathNode.LineTo(50.0f, 98.0f),
                    PathNode.LineTo(16.0f, 98.0f),
                    PathNode.CurveTo(12.686292f, 98.0f, 10.0f, 100.686295f, 10.0f, 104.0f),
                    PathNode.LineTo(10.0f, 144.0f),
                    PathNode.CurveTo(10.033067f, 173.80966f, 34.19033f, 197.96693f, 64.0f, 198.0f),
                    PathNode.LineTo(66.0f, 198.0f),
                    PathNode.LineTo(66.0f, 216.0f),
                    PathNode.CurveTo(66.0f, 219.3137f, 68.686295f, 222.0f, 72.0f, 222.0f),
                    PathNode.CurveTo(75.313705f, 222.0f, 78.0f, 219.3137f, 78.0f, 216.0f),
                    PathNode.LineTo(78.0f, 198.0f),
                    PathNode.LineTo(178.0f, 198.0f),
                    PathNode.LineTo(178.0f, 216.0f),
                    PathNode.CurveTo(178.0f, 219.3137f, 180.6863f, 222.0f, 184.0f, 222.0f),
                    PathNode.CurveTo(187.3137f, 222.0f, 190.0f, 219.3137f, 190.0f, 216.0f),
                    PathNode.LineTo(190.0f, 198.0f),
                    PathNode.LineTo(192.0f, 198.0f),
                    PathNode.CurveTo(221.80966f, 197.96693f, 245.96693f, 173.80966f, 246.0f, 144.0f),
                    PathNode.LineTo(246.0f, 104.0f),
                    PathNode.CurveTo(246.0f, 100.686295f, 243.3137f, 98.0f, 240.0f, 98.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.0f, 102.0f),
                    PathNode.LineTo(194.0f, 102.0f),
                    PathNode.LineTo(194.0f, 138.0f),
                    PathNode.LineTo(142.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.0f, 144.0f),
                    PathNode.CurveTo(234.0f, 167.19595f, 215.19595f, 186.0f, 192.0f, 186.0f),
                    PathNode.LineTo(64.0f, 186.0f),
                    PathNode.CurveTo(40.80404f, 186.0f, 22.0f, 167.19595f, 22.0f, 144.0f),
                    PathNode.LineTo(22.0f, 110.0f),
                    PathNode.LineTo(130.0f, 110.0f),
                    PathNode.LineTo(130.0f, 144.0f),
                    PathNode.CurveTo(130.0f, 147.3137f, 132.6863f, 150.0f, 136.0f, 150.0f),
                    PathNode.LineTo(200.0f, 150.0f),
                    PathNode.CurveTo(203.3137f, 150.0f, 206.0f, 147.3137f, 206.0f, 144.0f),
                    PathNode.LineTo(206.0f, 110.0f),
                    PathNode.LineTo(234.0f, 110.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bathtub!!
    }

private var _bathtub: ImageVector? = null
