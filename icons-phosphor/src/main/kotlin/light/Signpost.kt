package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Signpost: ImageVector
    get() {
        if (_signpost != null) return _signpost!!
        _signpost = phosphorLightIcon(
            name = "Signpost",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.46f, 108.0f),
                    PathNode.LineTo(210.84f, 70.63f),
                    PathNode.CurveTo(208.18562f, 67.68326f, 204.40598f, 66.00059f, 200.44f, 66.0f),
                    PathNode.LineTo(134.0f, 66.0f),
                    PathNode.LineTo(134.0f, 32.0f),
                    PathNode.CurveTo(134.0f, 28.68629f, 131.3137f, 26.0f, 128.0f, 26.0f),
                    PathNode.CurveTo(124.686295f, 26.0f, 122.0f, 28.68629f, 122.0f, 32.0f),
                    PathNode.LineTo(122.0f, 66.0f),
                    PathNode.LineTo(40.0f, 66.0f),
                    PathNode.CurveTo(32.268013f, 66.0f, 26.0f, 72.26801f, 26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 144.0f),
                    PathNode.CurveTo(26.0f, 151.73198f, 32.268013f, 158.0f, 40.0f, 158.0f),
                    PathNode.LineTo(122.0f, 158.0f),
                    PathNode.LineTo(122.0f, 224.0f),
                    PathNode.CurveTo(122.0f, 227.3137f, 124.686295f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(131.3137f, 230.0f, 134.0f, 227.3137f, 134.0f, 224.0f),
                    PathNode.LineTo(134.0f, 158.0f),
                    PathNode.LineTo(200.44f, 158.0f),
                    PathNode.CurveTo(204.40598f, 157.99942f, 208.18562f, 156.31674f, 210.84f, 153.37f),
                    PathNode.LineTo(244.46f, 116.0f),
                    PathNode.CurveTo(246.49715f, 113.7224f, 246.49715f, 110.2776f, 244.46f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(201.92f, 145.35f),
                    PathNode.CurveTo(201.54189f, 145.76895f, 201.00436f, 146.00867f, 200.44f, 146.01f),
                    PathNode.LineTo(40.0f, 146.01f),
                    PathNode.CurveTo(38.89543f, 146.01f, 38.0f, 145.11456f, 38.0f, 144.01f),
                    PathNode.LineTo(38.0f, 80.0f),
                    PathNode.CurveTo(38.0f, 78.89543f, 38.89543f, 78.0f, 40.0f, 78.0f),
                    PathNode.LineTo(200.44f, 78.0f),
                    PathNode.CurveTo(201.00436f, 78.001335f, 201.54189f, 78.24104f, 201.92f, 78.66f),
                    PathNode.LineTo(231.92f, 112.0f),
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
        return _signpost!!
    }

private var _signpost: ImageVector? = null
