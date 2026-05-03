package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = lucideOutlineIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.999827f, 5.191209f, 11.512545f, 4.462132f, 10.765309f, 4.152644f),
                    PathNode.CurveTo(10.018073f, 3.843156f, 9.157989f, 4.014184f, 8.586f, 4.586f),
                    PathNode.LineTo(2.586f, 10.586f),
                    PathNode.CurveTo(1.805236f, 11.367f, 1.805236f, 12.633f, 2.586f, 13.414f),
                    PathNode.LineTo(8.586f, 19.414f),
                    PathNode.CurveTo(9.157989f, 19.985815f, 10.018073f, 20.156843f, 10.765309f, 19.847357f),
                    PathNode.CurveTo(11.512545f, 19.537868f, 11.999827f, 18.808792f, 12.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 6.0f),
                    PathNode.CurveTo(21.999826f, 5.191209f, 21.512545f, 4.462132f, 20.765308f, 4.152644f),
                    PathNode.CurveTo(20.018074f, 3.843156f, 19.157988f, 4.014184f, 18.586f, 4.586f),
                    PathNode.LineTo(12.586f, 10.586f),
                    PathNode.CurveTo(11.805236f, 11.367f, 11.805236f, 12.633f, 12.586f, 13.414f),
                    PathNode.LineTo(18.586f, 19.414f),
                    PathNode.CurveTo(19.157988f, 19.985815f, 20.018074f, 20.156843f, 20.765308f, 19.847357f),
                    PathNode.CurveTo(21.512545f, 19.537868f, 21.999826f, 18.808792f, 22.0f, 18.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _rewind!!
    }

private var _rewind: ImageVector? = null
