package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorFillIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 120.0f),
                    PathNode.LineTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(40.0f, 224.0f),
                    PathNode.CurveTo(35.581722f, 224.0f, 32.0f, 220.41827f, 32.0f, 216.0f),
                    PathNode.LineTo(32.0f, 120.0f),
                    PathNode.CurveTo(31.984877f, 115.75096f, 33.674286f, 111.673325f, 36.69f, 108.68f),
                    PathNode.LineTo(116.69f, 28.68f),
                    PathNode.CurveTo(122.93754f, 22.436554f, 133.06245f, 22.436554f, 139.31f, 28.68f),
                    PathNode.LineTo(219.31f, 108.68f),
                    PathNode.CurveTo(222.32571f, 111.673325f, 224.01512f, 115.75096f, 224.0f, 120.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
