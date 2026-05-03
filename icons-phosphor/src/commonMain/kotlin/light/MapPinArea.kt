package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapPinArea: ImageVector
    get() {
        if (_mapPinArea != null) return _mapPinArea!!
        _mapPinArea = phosphorLightIcon(
            name = "MapPinArea",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(114.0f, 80.0f),
                    PathNode.CurveTo(114.0f, 72.26801f, 120.26801f, 66.0f, 128.0f, 66.0f),
                    PathNode.CurveTo(135.73198f, 66.0f, 142.0f, 72.26801f, 142.0f, 80.0f),
                    PathNode.CurveTo(142.0f, 87.73199f, 135.73198f, 94.0f, 128.0f, 94.0f),
                    PathNode.CurveTo(120.26801f, 94.0f, 114.0f, 87.73199f, 114.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(66.0f, 80.0f),
                    PathNode.CurveTo(66.0f, 45.758347f, 93.75835f, 18.0f, 128.0f, 18.0f),
                    PathNode.CurveTo(162.24165f, 18.0f, 190.0f, 45.758347f, 190.0f, 80.0f),
                    PathNode.CurveTo(190.0f, 138.81f, 133.39f, 171.83f, 131.0f, 173.21f),
                    PathNode.CurveTo(129.1436f, 174.2818f, 126.85641f, 174.2818f, 125.0f, 173.21f),
                    PathNode.CurveTo(122.61f, 171.83f, 66.0f, 138.81f, 66.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(78.0f, 80.0f),
                    PathNode.CurveTo(78.0f, 124.52f, 116.81f, 153.49f, 128.0f, 160.91f),
                    PathNode.CurveTo(139.18f, 153.49f, 178.0f, 124.53f, 178.0f, 80.0f),
                    PathNode.CurveTo(178.0f, 52.38576f, 155.61424f, 30.0f, 128.0f, 30.0f),
                    PathNode.CurveTo(100.385765f, 30.0f, 78.0f, 52.38576f, 78.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.08f, 149.51f),
                    PathNode.CurveTo(200.05273f, 148.68979f, 197.73976f, 149.03755f, 196.0433f, 150.41763f),
                    PathNode.CurveTo(194.34685f, 151.79771f, 193.53563f, 153.9915f, 193.92609f, 156.14326f),
                    PathNode.CurveTo(194.31654f, 158.29504f, 195.84682f, 160.06395f, 197.92f, 160.76f),
                    PathNode.CurveTo(215.5f, 167.25f, 226.0f, 175.94f, 226.0f, 184.0f),
                    PathNode.CurveTo(226.0f, 200.08f, 185.75f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(70.25f, 218.0f, 30.0f, 200.08f, 30.0f, 184.0f),
                    PathNode.CurveTo(30.0f, 175.94f, 40.5f, 167.25f, 58.08f, 160.76f),
                    PathNode.CurveTo(60.153183f, 160.06395f, 61.683456f, 158.29504f, 62.073914f, 156.14326f),
                    PathNode.CurveTo(62.464367f, 153.9915f, 61.653152f, 151.79771f, 59.9567f, 150.41763f),
                    PathNode.CurveTo(58.260246f, 149.03755f, 55.947273f, 148.68979f, 53.92f, 149.51f),
                    PathNode.CurveTo(30.76f, 158.06f, 18.0f, 170.31f, 18.0f, 184.0f),
                    PathNode.CurveTo(18.0f, 197.34f, 30.18f, 209.38f, 52.31f, 217.88f),
                    PathNode.CurveTo(72.62f, 225.7f, 99.5f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(156.5f, 230.0f, 183.38f, 225.7f, 203.69f, 217.88f),
                    PathNode.CurveTo(225.82f, 209.38f, 238.0f, 197.34f, 238.0f, 184.0f),
                    PathNode.CurveTo(238.0f, 170.31f, 225.24f, 158.06f, 202.08f, 149.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mapPinArea!!
    }

private var _mapPinArea: ImageVector? = null
