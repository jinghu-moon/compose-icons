package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FilmReel: ImageVector
    get() {
        if (_filmReel != null) return _filmReel!!
        _filmReel = phosphorFillIcon(
            name = "FilmReel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 216.0f),
                    PathNode.LineTo(183.36f, 216.0f),
                    PathNode.CurveTo(227.17738f, 188.39369f, 243.99031f, 132.74449f, 222.78879f, 85.494446f),
                    PathNode.CurveTo(201.58728f, 38.244404f, 148.83916f, 13.807874f, 99.0867f, 28.187195f),
                    PathNode.CurveTo(49.33425f, 42.566517f, 17.755228f, 91.37505f, 25.029251f, 142.65039f),
                    PathNode.CurveTo(32.303272f, 193.92574f, 76.21129f, 232.02551f, 128.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(236.41827f, 232.0f, 240.0f, 228.41827f, 240.0f, 224.0f),
                    PathNode.CurveTo(240.0f, 219.58173f, 236.41827f, 216.0f, 232.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 148.0f),
                    PathNode.CurveTo(68.95431f, 148.0f, 60.0f, 139.0457f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 116.95431f, 68.95431f, 108.0f, 80.0f, 108.0f),
                    PathNode.CurveTo(91.04569f, 108.0f, 100.0f, 116.95431f, 100.0f, 128.0f),
                    PathNode.CurveTo(100.0f, 139.0457f, 91.04569f, 148.0f, 80.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(116.95431f, 196.0f, 108.0f, 187.0457f, 108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 164.9543f, 116.95431f, 156.0f, 128.0f, 156.0f),
                    PathNode.CurveTo(139.0457f, 156.0f, 148.0f, 164.9543f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 187.0457f, 139.0457f, 196.0f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 100.0f),
                    PathNode.CurveTo(116.95431f, 100.0f, 108.0f, 91.04569f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 68.95431f, 116.95431f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(139.0457f, 60.0f, 148.0f, 68.95431f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 91.04569f, 139.0457f, 100.0f, 128.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 128.0f),
                    PathNode.CurveTo(156.0f, 116.95431f, 164.9543f, 108.0f, 176.0f, 108.0f),
                    PathNode.CurveTo(187.0457f, 108.0f, 196.0f, 116.95431f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 139.0457f, 187.0457f, 148.0f, 176.0f, 148.0f),
                    PathNode.CurveTo(164.9543f, 148.0f, 156.0f, 139.0457f, 156.0f, 128.0f),
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
        return _filmReel!!
    }

private var _filmReel: ImageVector? = null
