package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) return _arrowDown!!
        _arrowDown = phosphorDuotoneIcon(
            name = "ArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 144.0f),
                    PathNode.LineTo(128.0f, 216.0f),
                    PathNode.LineTo(56.0f, 144.0f),
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
                    PathNode.MoveTo(207.39f, 140.94f),
                    PathNode.CurveTo(206.15236f, 137.95038f, 203.23566f, 136.00067f, 200.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 35.581722f, 132.41827f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(123.58172f, 32.0f, 120.0f, 35.581722f, 120.0f, 40.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(56.0f, 136.0f),
                    PathNode.CurveTo(52.76235f, 135.99745f, 49.84236f, 137.94662f, 48.60302f, 140.93768f),
                    PathNode.CurveTo(47.363674f, 143.92874f, 48.04936f, 147.3719f, 50.34f, 149.66f),
                    PathNode.LineTo(122.34f, 221.66f),
                    PathNode.CurveTo(123.840546f, 223.16223f, 125.876724f, 224.00629f, 128.0f, 224.00629f),
                    PathNode.CurveTo(130.12328f, 224.00629f, 132.15945f, 223.16223f, 133.66f, 221.66f),
                    PathNode.LineTo(205.66f, 149.66f),
                    PathNode.CurveTo(207.94725f, 147.37076f, 208.63007f, 143.92903f, 207.39f, 140.94f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 204.69f),
                    PathNode.LineTo(75.31f, 152.0f),
                    PathNode.LineTo(180.69f, 152.0f),
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
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
