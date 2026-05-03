package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Shell: ImageVector
    get() {
        if (_shell != null) return _shell!!
        _shell = lucideOutlineIcon(
            name = "Shell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 12.104569f, 13.104569f, 13.0f, 12.0f, 13.0f),
                    PathNode.CurveTo(10.895431f, 13.0f, 10.0f, 12.104569f, 10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 8.790861f, 11.790861f, 7.0f, 14.0f, 7.0f),
                    PathNode.CurveTo(16.209139f, 7.0f, 18.0f, 8.790861f, 18.0f, 11.0f),
                    PathNode.CurveTo(18.0f, 14.313708f, 15.313708f, 17.0f, 12.0f, 17.0f),
                    PathNode.CurveTo(8.686292f, 17.0f, 6.0f, 14.313708f, 6.0f, 11.0f),
                    PathNode.CurveTo(6.0f, 6.581722f, 9.581722f, 3.0f, 14.0f, 3.0f),
                    PathNode.CurveTo(18.418278f, 3.0f, 22.0f, 6.581722f, 22.0f, 11.0f),
                    PathNode.CurveTo(22.0f, 16.522848f, 17.522848f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(6.477153f, 21.0f, 2.0f, 16.522848f, 2.0f, 11.0f),
                    PathNode.CurveTo(1.996314f, 8.393595f, 2.846296f, 5.857696f, 4.42f, 3.78f),
                    PathNode.CurveTo(4.837537f, 3.164213f, 5.56238f, 2.83109f, 6.301601f, 2.915255f),
                    PathNode.CurveTo(7.040821f, 2.999421f, 7.672226f, 3.486961f, 7.940648f, 4.180849f),
                    PathNode.CurveTo(8.20907f, 4.874737f, 8.070139f, 5.660273f, 7.58f, 6.22f)
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
        return _shell!!
    }

private var _shell: ImageVector? = null
