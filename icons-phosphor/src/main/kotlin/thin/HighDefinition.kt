package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HighDefinition: ImageVector
    get() {
        if (_highDefinition != null) return _highDefinition!!
        _highDefinition = phosphorThinIcon(
            name = "HighDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 76.0f),
                    PathNode.LineTo(152.0f, 76.0f),
                    PathNode.CurveTo(149.79086f, 76.0f, 148.0f, 77.79086f, 148.0f, 80.0f),
                    PathNode.LineTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 178.20914f, 149.79086f, 180.0f, 152.0f, 180.0f),
                    PathNode.LineTo(176.0f, 180.0f),
                    PathNode.CurveTo(204.71881f, 180.0f, 228.0f, 156.71881f, 228.0f, 128.0f),
                    PathNode.CurveTo(228.0f, 99.2812f, 204.71881f, 76.0f, 176.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 172.0f),
                    PathNode.LineTo(156.0f, 172.0f),
                    PathNode.LineTo(156.0f, 84.0f),
                    PathNode.LineTo(176.0f, 84.0f),
                    PathNode.CurveTo(200.30052f, 84.0f, 220.0f, 103.69947f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 152.30052f, 200.30052f, 172.0f, 176.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(52.0f, 132.0f),
                    PathNode.LineTo(52.0f, 176.0f),
                    PathNode.CurveTo(52.0f, 178.20914f, 50.20914f, 180.0f, 48.0f, 180.0f),
                    PathNode.CurveTo(45.79086f, 180.0f, 44.0f, 178.20914f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 80.0f),
                    PathNode.CurveTo(44.0f, 77.79086f, 45.79086f, 76.0f, 48.0f, 76.0f),
                    PathNode.CurveTo(50.20914f, 76.0f, 52.0f, 77.79086f, 52.0f, 80.0f),
                    PathNode.LineTo(52.0f, 124.0f),
                    PathNode.LineTo(116.0f, 124.0f),
                    PathNode.LineTo(116.0f, 80.0f),
                    PathNode.CurveTo(116.0f, 77.79086f, 117.79086f, 76.0f, 120.0f, 76.0f),
                    PathNode.CurveTo(122.20914f, 76.0f, 124.0f, 77.79086f, 124.0f, 80.0f),
                    PathNode.LineTo(124.0f, 176.0f),
                    PathNode.CurveTo(124.0f, 178.20914f, 122.20914f, 180.0f, 120.0f, 180.0f),
                    PathNode.CurveTo(117.79086f, 180.0f, 116.0f, 178.20914f, 116.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 48.0f),
                    PathNode.CurveTo(28.0f, 45.79086f, 29.790861f, 44.0f, 32.0f, 44.0f),
                    PathNode.LineTo(224.0f, 44.0f),
                    PathNode.CurveTo(226.20914f, 44.0f, 228.0f, 45.79086f, 228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 50.20914f, 226.20914f, 52.0f, 224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(29.790861f, 52.0f, 28.0f, 50.20914f, 28.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.LineTo(32.0f, 212.0f),
                    PathNode.CurveTo(29.790861f, 212.0f, 28.0f, 210.20914f, 28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 205.79086f, 29.790861f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 205.79086f, 228.0f, 208.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _highDefinition!!
    }

private var _highDefinition: ImageVector? = null
