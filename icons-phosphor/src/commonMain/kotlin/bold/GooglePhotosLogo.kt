package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) return _googlePhotosLogo!!
        _googlePhotosLogo = phosphorBoldIcon(
            name = "GooglePhotosLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 116.0f),
                    PathNode.LineTo(198.64f, 116.0f),
                    PathNode.CurveTo(207.9143f, 92.59757f, 204.99895f, 66.121284f, 190.85481f, 45.297512f),
                    PathNode.CurveTo(176.71066f, 24.473742f, 153.17313f, 12.004665f, 128.0f, 12.0f),
                    PathNode.CurveTo(121.37258f, 12.0f, 116.0f, 17.372583f, 116.0f, 24.0f),
                    PathNode.LineTo(116.0f, 57.36f),
                    PathNode.CurveTo(92.59757f, 48.08569f, 66.121284f, 51.00105f, 45.297512f, 65.145195f),
                    PathNode.CurveTo(24.473742f, 79.28934f, 12.004665f, 102.82687f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 134.62741f, 17.372583f, 140.0f, 24.0f, 140.0f),
                    PathNode.LineTo(57.36f, 140.0f),
                    PathNode.CurveTo(48.08569f, 163.40242f, 51.00105f, 189.87872f, 65.145195f, 210.70248f),
                    PathNode.CurveTo(79.28934f, 231.52626f, 102.82687f, 243.99533f, 128.0f, 244.0f),
                    PathNode.CurveTo(134.62741f, 244.0f, 140.0f, 238.62741f, 140.0f, 232.0f),
                    PathNode.LineTo(140.0f, 198.64f),
                    PathNode.CurveTo(163.40242f, 207.9143f, 189.87872f, 204.99895f, 210.70248f, 190.85481f),
                    PathNode.CurveTo(231.52626f, 176.71066f, 243.99533f, 153.17313f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 121.37258f, 238.62741f, 116.0f, 232.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 88.0f),
                    PathNode.CurveTo(180.03568f, 97.9276f, 177.19449f, 107.65294f, 171.82f, 116.0f),
                    PathNode.LineTo(140.0f, 116.0f),
                    PathNode.LineTo(140.0f, 37.4f),
                    PathNode.CurveTo(163.42831f, 42.99031f, 179.96877f, 63.91397f, 180.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 76.0f),
                    PathNode.CurveTo(97.9276f, 75.96432f, 107.65294f, 78.80551f, 116.0f, 84.18f),
                    PathNode.LineTo(116.0f, 116.0f),
                    PathNode.LineTo(37.4f, 116.0f),
                    PathNode.CurveTo(42.99031f, 92.57168f, 63.91397f, 76.031235f, 88.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 168.0f),
                    PathNode.CurveTo(75.96432f, 158.0724f, 78.80551f, 148.34706f, 84.18f, 140.0f),
                    PathNode.LineTo(116.0f, 140.0f),
                    PathNode.LineTo(116.0f, 218.6f),
                    PathNode.CurveTo(92.57168f, 213.00969f, 76.031235f, 192.08603f, 76.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 180.0f),
                    PathNode.CurveTo(158.0724f, 180.03568f, 148.34706f, 177.19449f, 140.0f, 171.82f),
                    PathNode.LineTo(140.0f, 140.0f),
                    PathNode.LineTo(218.6f, 140.0f),
                    PathNode.CurveTo(213.00969f, 163.42831f, 192.08603f, 179.96877f, 168.0f, 180.0f),
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
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
