package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ArrowArcLeft: ImageVector
    get() {
        if (_arrowArcLeft != null) return _arrowArcLeft!!
        _arrowArcLeft = phosphorRegularIcon(
            name = "ArrowArcLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 188.41827f, 228.41827f, 192.0f, 224.0f, 192.0f),
                    PathNode.CurveTo(219.58173f, 192.0f, 216.0f, 188.41827f, 216.0f, 184.0f),
                    PathNode.CurveTo(215.99564f, 148.41068f, 194.55516f, 116.327644f, 161.67468f, 102.708786f),
                    PathNode.CurveTo(128.79419f, 89.089935f, 90.94763f, 96.61673f, 65.78f, 121.78f),
                    PathNode.LineTo(43.4f, 144.0f),
                    PathNode.LineTo(88.0f, 144.0f),
                    PathNode.CurveTo(92.41828f, 144.0f, 96.0f, 147.58173f, 96.0f, 152.0f),
                    PathNode.CurveTo(96.0f, 156.41827f, 92.41828f, 160.0f, 88.0f, 160.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(19.581722f, 160.0f, 16.0f, 156.41827f, 16.0f, 152.0f),
                    PathNode.LineTo(16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 83.58172f, 19.581722f, 80.0f, 24.0f, 80.0f),
                    PathNode.CurveTo(28.418278f, 80.0f, 32.0f, 83.58172f, 32.0f, 88.0f),
                    PathNode.LineTo(32.0f, 132.77f),
                    PathNode.LineTo(54.48f, 110.44f),
                    PathNode.CurveTo(84.22827f, 80.707184f, 128.95673f, 71.8194f, 167.81238f, 87.92025f),
                    PathNode.CurveTo(206.66805f, 104.021095f, 232.00073f, 141.94052f, 232.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowArcLeft!!
    }

private var _arrowArcLeft: ImageVector? = null
