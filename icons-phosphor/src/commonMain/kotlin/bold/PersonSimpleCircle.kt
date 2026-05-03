package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonSimpleCircle: ImageVector
    get() {
        if (_personSimpleCircle != null) return _personSimpleCircle!!
        _personSimpleCircle = phosphorBoldIcon(
            name = "PersonSimpleCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 20.0f),
                    PathNode.CurveTo(68.35325f, 20.0f, 20.0f, 68.35325f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 187.64676f, 68.35325f, 236.0f, 128.0f, 236.0f),
                    PathNode.CurveTo(187.64676f, 236.0f, 236.0f, 187.64676f, 236.0f, 128.0f),
                    PathNode.CurveTo(235.93387f, 68.38066f, 187.61934f, 20.066133f, 128.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 81.60808f, 81.60808f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(174.39192f, 44.0f, 212.0f, 81.60808f, 212.0f, 128.0f),
                    PathNode.CurveTo(211.9504f, 174.37135f, 174.37135f, 211.9504f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 68.95431f, 116.95431f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(139.0457f, 60.0f, 148.0f, 68.95431f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 91.04569f, 139.0457f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(116.95431f, 100.0f, 108.0f, 91.04569f, 108.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 126.62742f, 178.62741f, 132.0f, 172.0f, 132.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.LineTo(140.0f, 132.51f),
                    PathNode.LineTo(166.12f, 173.56f),
                    PathNode.CurveTo(169.67397f, 179.1496f, 168.02686f, 186.56169f, 162.44f, 190.12f),
                    PathNode.CurveTo(160.51973f, 191.35498f, 158.28311f, 192.0079f, 156.0f, 192.0f),
                    PathNode.CurveTo(151.89455f, 192.00153f, 148.07326f, 189.90416f, 145.87f, 186.44f),
                    PathNode.LineTo(128.0f, 158.35f),
                    PathNode.LineTo(110.12f, 186.44f),
                    PathNode.CurveTo(106.48037f, 191.82193f, 99.218506f, 193.32971f, 93.73717f, 189.8416f),
                    PathNode.CurveTo(88.25583f, 186.35347f, 86.546104f, 179.13649f, 89.88f, 173.56f),
                    PathNode.LineTo(116.0f, 132.51f),
                    PathNode.LineTo(116.0f, 132.0f),
                    PathNode.LineTo(84.0f, 132.0f),
                    PathNode.CurveTo(77.37258f, 132.0f, 72.0f, 126.62742f, 72.0f, 120.0f),
                    PathNode.CurveTo(72.0f, 113.37258f, 77.37258f, 108.0f, 84.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.CurveTo(178.62741f, 108.0f, 184.0f, 113.37258f, 184.0f, 120.0f),
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
        return _personSimpleCircle!!
    }

private var _personSimpleCircle: ImageVector? = null
