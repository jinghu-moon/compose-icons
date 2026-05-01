package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.House: ImageVector
    get() {
        if (_house != null) return _house!!
        _house = phosphorFillIcon(
            name = "House",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.CurveTo(155.58173f, 224.0f, 152.0f, 220.41827f, 152.0f, 216.0f),
                    PathNode.LineTo(152.0f, 164.0f),
                    PathNode.CurveTo(152.0f, 161.79086f, 150.20914f, 160.0f, 148.0f, 160.0f),
                    PathNode.LineTo(108.0f, 160.0f),
                    PathNode.CurveTo(105.79086f, 160.0f, 104.0f, 161.79086f, 104.0f, 164.0f),
                    PathNode.LineTo(104.0f, 216.0f),
                    PathNode.CurveTo(104.0f, 220.41827f, 100.41828f, 224.0f, 96.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(32.00197f, 115.757286f, 33.688965f, 111.689064f, 36.69f, 108.69f),
                    PathNode.LineTo(116.69f, 28.69f),
                    PathNode.CurveTo(122.93754f, 22.446554f, 133.06245f, 22.446554f, 139.31f, 28.69f),
                    PathNode.LineTo(219.31f, 108.69f),
                    PathNode.CurveTo(222.31104f, 111.689064f, 223.99803f, 115.757286f, 224.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _house!!
    }

private var _house: ImageVector? = null
