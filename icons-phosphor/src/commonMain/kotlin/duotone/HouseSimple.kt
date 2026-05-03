package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) return _houseSimple!!
        _houseSimple = phosphorDuotoneIcon(
            name = "HouseSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 120.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(39.998333f, 117.87763f, 40.84009f, 115.841576f, 42.34f, 114.34f),
                    PathNode.LineTo(122.34f, 34.34f),
                    PathNode.CurveTo(123.840546f, 32.837784f, 125.876724f, 31.993708f, 128.0f, 31.993708f),
                    PathNode.CurveTo(130.12328f, 31.993708f, 132.15945f, 32.837784f, 133.66f, 34.34f),
                    PathNode.LineTo(213.66f, 114.34f),
                    PathNode.CurveTo(215.15993f, 115.841576f, 216.00166f, 117.87763f, 216.0f, 120.0f),
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
                    PathNode.MoveTo(219.31f, 108.68f),
                    PathNode.LineTo(139.31f, 28.68f),
                    PathNode.CurveTo(133.06245f, 22.436554f, 122.93754f, 22.436554f, 116.69f, 28.68f),
                    PathNode.LineTo(36.69f, 108.68f),
                    PathNode.CurveTo(33.674286f, 111.673325f, 31.984877f, 115.75096f, 32.0f, 120.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 120.0f),
                    PathNode.CurveTo(224.01512f, 115.75096f, 222.32571f, 111.673325f, 219.31f, 108.68f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 120.0f),
                    PathNode.LineTo(128.0f, 40.0f),
                    PathNode.LineTo(208.0f, 120.0f),
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
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
