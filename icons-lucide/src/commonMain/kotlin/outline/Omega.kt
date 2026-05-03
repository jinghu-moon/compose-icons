package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Omega: ImageVector
    get() {
        if (_omega != null) return _omega!!
        _omega = lucideOutlineIcon(
            name = "Omega",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 20.0f),
                    PathNode.LineTo(7.5f, 20.0f),
                    PathNode.CurveTo(7.776143f, 20.0f, 8.0f, 19.776142f, 8.0f, 19.5f),
                    PathNode.LineTo(8.0f, 19.218f),
                    PathNode.CurveTo(7.998082f, 19.039608f, 7.904846f, 18.87465f, 7.753f, 18.781f),
                    PathNode.CurveTo(4.72963f, 16.88754f, 3.32527f, 13.221085f, 4.310093f, 9.792371f),
                    PathNode.CurveTo(5.294915f, 6.363658f, 8.430915f, 4.001319f, 11.99826f, 4.000899f),
                    PathNode.CurveTo(15.565605f, 4.000479f, 18.702162f, 6.362079f, 19.687792f, 9.790561f),
                    PathNode.CurveTo(20.673422f, 13.219042f, 19.269924f, 16.88583f, 16.247f, 18.78f),
                    PathNode.CurveTo(16.094856f, 18.87384f, 16.001575f, 19.03925f, 16.0f, 19.218f),
                    PathNode.LineTo(16.0f, 19.5f),
                    PathNode.CurveTo(16.0f, 19.776142f, 16.223858f, 20.0f, 16.5f, 20.0f),
                    PathNode.LineTo(21.0f, 20.0f)
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
        return _omega!!
    }

private var _omega: ImageVector? = null
