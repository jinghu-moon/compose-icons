package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.NumberFour: ImageVector
    get() {
        if (_numberFour != null) return _numberFour!!
        _numberFour = phosphorBoldIcon(
            name = "NumberFour",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 156.0f),
                    PathNode.LineTo(172.0f, 156.0f),
                    PathNode.LineTo(172.0f, 48.0f),
                    PathNode.CurveTo(172.00133f, 42.90329f, 168.78302f, 38.36177f, 163.97388f, 36.67396f),
                    PathNode.CurveTo(159.16475f, 34.986153f, 153.81412f, 36.52032f, 150.63f, 40.5f),
                    PathNode.LineTo(54.63f, 160.5f),
                    PathNode.CurveTo(51.74615f, 164.10193f, 51.18296f, 169.03835f, 53.181385f, 173.19728f),
                    PathNode.CurveTo(55.17981f, 177.35622f, 59.38584f, 180.00096f, 64.0f, 180.0f),
                    PathNode.LineTo(148.0f, 180.0f),
                    PathNode.LineTo(148.0f, 208.0f),
                    PathNode.CurveTo(148.0f, 214.62741f, 153.37259f, 220.0f, 160.0f, 220.0f),
                    PathNode.CurveTo(166.62741f, 220.0f, 172.0f, 214.62741f, 172.0f, 208.0f),
                    PathNode.LineTo(172.0f, 180.0f),
                    PathNode.LineTo(184.0f, 180.0f),
                    PathNode.CurveTo(190.62741f, 180.0f, 196.0f, 174.62741f, 196.0f, 168.0f),
                    PathNode.CurveTo(196.0f, 161.37259f, 190.62741f, 156.0f, 184.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 156.0f),
                    PathNode.LineTo(89.0f, 156.0f),
                    PathNode.LineTo(148.0f, 82.21f),
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
        return _numberFour!!
    }

private var _numberFour: ImageVector? = null
