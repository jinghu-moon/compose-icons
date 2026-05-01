package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CaretLineDown: ImageVector
    get() {
        if (_caretLineDown != null) return _caretLineDown!!
        _caretLineDown = phosphorDuotoneIcon(
            name = "CaretLineDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 72.0f),
                    PathNode.LineTo(128.0f, 152.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(122.34f, 157.66f),
                    PathNode.CurveTo(123.840546f, 159.16223f, 125.876724f, 160.00629f, 128.0f, 160.00629f),
                    PathNode.CurveTo(130.12328f, 160.00629f, 132.15945f, 159.16223f, 133.66f, 157.66f),
                    PathNode.LineTo(213.66f, 77.66f),
                    PathNode.CurveTo(215.95064f, 75.37191f, 216.63632f, 71.92874f, 215.39697f, 68.937675f),
                    PathNode.CurveTo(214.15764f, 65.94662f, 211.23764f, 63.99745f, 208.0f, 64.0f),
                    PathNode.LineTo(48.0f, 64.0f),
                    PathNode.CurveTo(44.76235f, 63.99745f, 41.84236f, 65.94662f, 40.60302f, 68.937675f),
                    PathNode.CurveTo(39.363674f, 71.92874f, 40.04936f, 75.37191f, 42.34f, 77.66f),
                    PathNode.Close,
                    PathNode.MoveTo(188.69f, 80.0f),
                    PathNode.LineTo(128.0f, 140.69f),
                    PathNode.LineTo(67.31f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(216.0f, 196.41827f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.CurveTo(43.581722f, 200.0f, 40.0f, 196.41827f, 40.0f, 192.0f),
                    PathNode.CurveTo(40.0f, 187.58173f, 43.581722f, 184.0f, 48.0f, 184.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.CurveTo(212.41827f, 184.0f, 216.0f, 187.58173f, 216.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _caretLineDown!!
    }

private var _caretLineDown: ImageVector? = null
