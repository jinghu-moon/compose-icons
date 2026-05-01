package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorLightIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 134.0f),
                    PathNode.LineTo(54.26f, 134.0f),
                    PathNode.CurveTo(57.426163f, 172.38913f, 89.48056f, 201.94838f, 128.0f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(203.3137f, 202.0f, 206.0f, 204.6863f, 206.0f, 208.0f),
                    PathNode.CurveTo(206.0f, 211.3137f, 203.3137f, 214.0f, 200.0f, 214.0f),
                    PathNode.LineTo(128.0f, 214.0f),
                    PathNode.CurveTo(80.50351f, 214.0f, 42.0f, 175.49649f, 42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 80.50351f, 80.50351f, 42.0f, 128.0f, 42.0f),
                    PathNode.LineTo(200.0f, 42.0f),
                    PathNode.CurveTo(203.3137f, 42.0f, 206.0f, 44.68629f, 206.0f, 48.0f),
                    PathNode.CurveTo(206.0f, 51.31371f, 203.3137f, 54.0f, 200.0f, 54.0f),
                    PathNode.LineTo(128.0f, 54.0f),
                    PathNode.CurveTo(89.48056f, 54.05162f, 57.426163f, 83.61087f, 54.26f, 122.0f),
                    PathNode.LineTo(200.0f, 122.0f),
                    PathNode.CurveTo(203.3137f, 122.0f, 206.0f, 124.686295f, 206.0f, 128.0f),
                    PathNode.CurveTo(206.0f, 131.3137f, 203.3137f, 134.0f, 200.0f, 134.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
