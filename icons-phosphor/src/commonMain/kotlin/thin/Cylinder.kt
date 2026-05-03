package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cylinder: ImageVector
    get() {
        if (_cylinder != null) return _cylinder!!
        _cylinder = phosphorThinIcon(
            name = "Cylinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(89.87f, 20.0f, 60.0f, 37.57f, 60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 196.0f),
                    PathNode.CurveTo(60.0f, 218.43f, 89.87f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(166.13f, 236.0f, 196.0f, 218.43f, 196.0f, 196.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.CurveTo(196.0f, 37.57f, 166.13f, 20.0f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(160.52f, 28.0f, 188.0f, 42.65f, 188.0f, 60.0f),
                    PathNode.CurveTo(188.0f, 77.35f, 160.52f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(95.48f, 92.0f, 68.0f, 77.35f, 68.0f, 60.0f),
                    PathNode.CurveTo(68.0f, 42.65f, 95.48f, 28.0f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 196.0f),
                    PathNode.CurveTo(188.0f, 213.35f, 160.52f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(95.48f, 228.0f, 68.0f, 213.35f, 68.0f, 196.0f),
                    PathNode.LineTo(68.0f, 79.11f),
                    PathNode.CurveTo(79.35f, 91.65f, 101.71f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(154.29f, 100.0f, 176.65f, 91.65f, 188.0f, 79.11f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null
