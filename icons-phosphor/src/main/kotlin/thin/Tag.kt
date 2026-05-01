package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorThinIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.49f, 138.83f),
                    PathNode.LineTo(141.17f, 39.51f),
                    PathNode.CurveTo(138.92447f, 37.256035f, 135.87163f, 35.99242f, 132.69f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(37.79086f, 36.0f, 36.0f, 37.79086f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 132.69f),
                    PathNode.CurveTo(35.99242f, 135.87163f, 37.256035f, 138.92447f, 39.51f, 141.17f),
                    PathNode.LineTo(138.83f, 240.49f),
                    PathNode.CurveTo(141.08162f, 242.74945f, 144.14018f, 244.01947f, 147.33f, 244.01947f),
                    PathNode.CurveTo(150.51982f, 244.01947f, 153.57838f, 242.74945f, 155.83f, 240.49f),
                    PathNode.LineTo(240.52f, 155.8f),
                    PathNode.CurveTo(242.77945f, 153.54837f, 244.04947f, 150.48982f, 244.04947f, 147.3f),
                    PathNode.CurveTo(244.04947f, 144.11017f, 242.77945f, 141.05162f, 240.52f, 138.8f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 150.14f),
                    PathNode.LineTo(150.14f, 234.83f),
                    PathNode.CurveTo(148.57869f, 236.38753f, 146.05132f, 236.38753f, 144.49f, 234.83f),
                    PathNode.LineTo(45.17f, 135.51f),
                    PathNode.CurveTo(44.422493f, 134.76166f, 44.001812f, 133.74773f, 44.0f, 132.69f),
                    PathNode.LineTo(44.0f, 44.0f),
                    PathNode.LineTo(132.69f, 44.0f),
                    PathNode.CurveTo(133.74773f, 44.001812f, 134.76166f, 44.422493f, 135.51f, 45.17f),
                    PathNode.LineTo(234.83f, 144.49f),
                    PathNode.CurveTo(236.38753f, 146.05132f, 236.38753f, 148.57869f, 234.83f, 150.14f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 84.0f),
                    PathNode.CurveTo(92.0f, 88.41828f, 88.41828f, 92.0f, 84.0f, 92.0f),
                    PathNode.CurveTo(79.58172f, 92.0f, 76.0f, 88.41828f, 76.0f, 84.0f),
                    PathNode.CurveTo(76.0f, 79.58172f, 79.58172f, 76.0f, 84.0f, 76.0f),
                    PathNode.CurveTo(88.41828f, 76.0f, 92.0f, 79.58172f, 92.0f, 84.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _tag!!
    }

private var _tag: ImageVector? = null
