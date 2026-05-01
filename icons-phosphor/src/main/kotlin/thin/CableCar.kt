package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorThinIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.94f, 31.3f),
                    PathNode.CurveTo(243.75479f, 30.254831f, 243.16171f, 29.326143f, 242.29143f, 28.718447f),
                    PathNode.CurveTo(241.42114f, 28.11075f, 240.34502f, 27.87388f, 239.3f, 28.06f),
                    PathNode.LineTo(15.3f, 68.06f),
                    PathNode.CurveTo(13.254369f, 68.41832f, 11.823219f, 70.28254f, 12.005603f, 72.351295f),
                    PathNode.CurveTo(12.187986f, 74.42004f, 13.92323f, 76.00511f, 16.0f, 76.0f),
                    PathNode.CurveTo(16.234612f, 75.99987f, 16.468788f, 75.9798f, 16.7f, 75.94f),
                    PathNode.LineTo(124.0f, 56.78f),
                    PathNode.LineTo(124.0f, 100.0f),
                    PathNode.LineTo(64.0f, 100.0f),
                    PathNode.CurveTo(48.53603f, 100.0f, 36.0f, 112.536026f, 36.0f, 128.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 207.46397f, 48.53603f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(207.46397f, 220.0f, 220.0f, 207.46397f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 112.536026f, 207.46397f, 100.0f, 192.0f, 100.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(132.0f, 55.35f),
                    PathNode.LineTo(240.7f, 35.94f),
                    PathNode.CurveTo(241.74516f, 35.75477f, 242.67386f, 35.161713f, 243.28156f, 34.291428f),
                    PathNode.CurveTo(243.88925f, 33.421146f, 244.12611f, 32.34501f, 243.94f, 31.3f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 164.0f),
                    PathNode.LineTo(100.0f, 108.0f),
                    PathNode.LineTo(156.0f, 108.0f),
                    PathNode.LineTo(156.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 108.0f),
                    PathNode.LineTo(92.0f, 108.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(44.0f, 164.0f),
                    PathNode.LineTo(44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 116.95431f, 52.954304f, 108.0f, 64.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(52.954304f, 212.0f, 44.0f, 203.0457f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.LineTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 203.0457f, 203.0457f, 212.0f, 192.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.LineTo(212.0f, 164.0f),
                    PathNode.LineTo(164.0f, 164.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.LineTo(192.0f, 108.0f),
                    PathNode.CurveTo(203.0457f, 108.0f, 212.0f, 116.95431f, 212.0f, 128.0f),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
