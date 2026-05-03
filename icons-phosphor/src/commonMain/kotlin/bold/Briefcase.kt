package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Briefcase: ImageVector
    get() {
        if (_briefcase != null) return _briefcase!!
        _briefcase = phosphorBoldIcon(
            name = "Briefcase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 100.0f),
                    PathNode.CurveTo(100.0f, 93.37258f, 105.37258f, 88.0f, 112.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(150.62741f, 88.0f, 156.0f, 93.37258f, 156.0f, 100.0f),
                    PathNode.CurveTo(156.0f, 106.62742f, 150.62741f, 112.0f, 144.0f, 112.0f),
                    PathNode.LineTo(112.0f, 112.0f),
                    PathNode.CurveTo(105.37258f, 112.0f, 100.0f, 106.62742f, 100.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 68.0f),
                    PathNode.LineTo(236.0f, 196.0f),
                    PathNode.CurveTo(236.0f, 207.0457f, 227.0457f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(28.954306f, 216.0f, 20.0f, 207.0457f, 20.0f, 196.0f),
                    PathNode.LineTo(20.0f, 68.0f),
                    PathNode.CurveTo(20.0f, 56.954304f, 28.954306f, 48.0f, 40.0f, 48.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.LineTo(76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 24.536028f, 88.536026f, 12.0f, 104.0f, 12.0f),
                    PathNode.LineTo(152.0f, 12.0f),
                    PathNode.CurveTo(167.46397f, 12.0f, 180.0f, 24.536028f, 180.0f, 40.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(227.0457f, 48.0f, 236.0f, 56.954304f, 236.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 48.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.LineTo(156.0f, 40.0f),
                    PathNode.CurveTo(156.0f, 37.79086f, 154.20914f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(101.79086f, 36.0f, 100.0f, 37.79086f, 100.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 72.0f),
                    PathNode.LineTo(44.0f, 107.23f),
                    PathNode.CurveTo(69.895485f, 120.87827f, 98.727974f, 128.00745f, 128.0f, 128.0f),
                    PathNode.CurveTo(157.27315f, 128.00679f, 186.10626f, 120.87402f, 212.0f, 107.22f),
                    PathNode.LineTo(212.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.LineTo(212.0f, 133.94f),
                    PathNode.CurveTo(185.59703f, 145.84715f, 156.96373f, 152.00331f, 128.0f, 152.0f),
                    PathNode.CurveTo(99.03608f, 152.00514f, 70.4024f, 145.8489f, 44.0f, 133.94f),
                    PathNode.LineTo(44.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
