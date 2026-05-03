package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowLineDown: ImageVector
    get() {
        if (_arrowLineDown != null) return _arrowLineDown!!
        _arrowLineDown = phosphorDuotoneIcon(
            name = "ArrowLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 112.0f),
                    PathNode.LineTo(128.0f, 184.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.34f, 189.66f),
                    PathNode.CurveTo(123.840546f, 191.16223f, 125.876724f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(130.12328f, 192.00629f, 132.15945f, 191.16223f, 133.66f, 189.66f),
                    PathNode.LineTo(205.66f, 117.66f),
                    PathNode.CurveTo(207.95064f, 115.37191f, 208.63632f, 111.92874f, 207.39697f, 108.937675f),
                    PathNode.CurveTo(206.15764f, 105.94662f, 203.23764f, 103.99745f, 200.0f, 104.0f),
                    PathNode.LineTo(136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(136.0f, 27.581722f, 132.41827f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(123.58172f, 24.0f, 120.0f, 27.581722f, 120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(52.76235f, 103.99745f, 49.84236f, 105.94662f, 48.60302f, 108.937675f),
                    PathNode.CurveTo(47.363674f, 111.92874f, 48.04936f, 115.37191f, 50.34f, 117.66f),
                    PathNode.Close,
                    PathNode.MoveTo(180.69f, 120.0f),
                    PathNode.LineTo(128.0f, 172.69f),
                    PathNode.LineTo(75.31f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 211.58173f, 35.581722f, 208.0f, 40.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowLineDown!!
    }

private var _arrowLineDown: ImageVector? = null
