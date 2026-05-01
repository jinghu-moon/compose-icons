package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.PackageOpen: ImageVector
    get() {
        if (_packageOpen != null) return _packageOpen!!
        _packageOpen = lucideOutlineIcon(
            name = "PackageOpen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 22.0f),
                    PathNode.LineTo(12.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.17f, 2.21f),
                    PathNode.CurveTo(15.676439f, 1.926835f, 16.29356f, 1.926835f, 16.8f, 2.21f),
                    PathNode.LineTo(21.0f, 4.57f),
                    PathNode.CurveTo(21.605581f, 4.912442f, 21.98f, 5.554302f, 21.98f, 6.25f),
                    PathNode.CurveTo(21.98f, 6.945699f, 21.605581f, 7.587558f, 21.0f, 7.93f),
                    PathNode.LineTo(8.82f, 14.79f),
                    PathNode.CurveTo(8.311767f, 15.079899f, 7.688234f, 15.079899f, 7.18f, 14.79f),
                    PathNode.LineTo(3.0f, 12.43f),
                    PathNode.CurveTo(2.394418f, 12.087558f, 2.02f, 11.445699f, 2.02f, 10.75f),
                    PathNode.CurveTo(2.02f, 10.054301f, 2.394418f, 9.412442f, 3.0f, 9.07f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 13.0f),
                    PathNode.LineTo(20.0f, 16.87f),
                    PathNode.CurveTo(20.000795f, 17.63943f, 19.572725f, 18.345167f, 18.89f, 18.7f),
                    PathNode.LineTo(12.89f, 21.78f),
                    PathNode.CurveTo(12.332088f, 22.069944f, 11.667912f, 22.069944f, 11.11f, 21.78f),
                    PathNode.LineTo(5.11f, 18.7f),
                    PathNode.CurveTo(4.427274f, 18.345167f, 3.999204f, 17.63943f, 4.0f, 16.87f),
                    PathNode.LineTo(4.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.43f),
                    PathNode.CurveTo(21.605581f, 12.087558f, 21.98f, 11.445699f, 21.98f, 10.75f),
                    PathNode.CurveTo(21.98f, 10.054301f, 21.605581f, 9.412442f, 21.0f, 9.07f),
                    PathNode.LineTo(8.83f, 2.2f),
                    PathNode.CurveTo(8.32513f, 1.910876f, 7.70487f, 1.910876f, 7.2f, 2.2f),
                    PathNode.LineTo(3.0f, 4.57f),
                    PathNode.CurveTo(2.394418f, 4.912442f, 2.02f, 5.554302f, 2.02f, 6.25f),
                    PathNode.CurveTo(2.02f, 6.945699f, 2.394418f, 7.587558f, 3.0f, 7.93f),
                    PathNode.LineTo(15.18f, 14.79f),
                    PathNode.CurveTo(15.684653f, 15.07994f, 16.305347f, 15.07994f, 16.81f, 14.79f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _packageOpen!!
    }

private var _packageOpen: ImageVector? = null
