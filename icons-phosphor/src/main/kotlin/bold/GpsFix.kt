package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GpsFix: ImageVector
    get() {
        if (_gpsFix != null) return _gpsFix!!
        _gpsFix = phosphorBoldIcon(
            name = "GpsFix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 116.0f),
                    PathNode.LineTo(219.22f, 116.0f),
                    PathNode.CurveTo(213.72092f, 74.73952f, 181.26048f, 42.27909f, 140.0f, 36.78f),
                    PathNode.LineTo(140.0f, 16.0f),
                    PathNode.CurveTo(140.0f, 9.372583f, 134.62741f, 4.0f, 128.0f, 4.0f),
                    PathNode.CurveTo(121.37258f, 4.0f, 116.0f, 9.372583f, 116.0f, 16.0f),
                    PathNode.LineTo(116.0f, 36.78f),
                    PathNode.CurveTo(74.73952f, 42.27909f, 42.27909f, 74.73952f, 36.78f, 116.0f),
                    PathNode.LineTo(16.0f, 116.0f),
                    PathNode.CurveTo(9.372583f, 116.0f, 4.000001f, 121.37258f, 4.000001f, 128.0f),
                    PathNode.CurveTo(4.000001f, 134.62741f, 9.372583f, 140.0f, 16.0f, 140.0f),
                    PathNode.LineTo(36.78f, 140.0f),
                    PathNode.CurveTo(42.27909f, 181.26048f, 74.73952f, 213.72092f, 116.0f, 219.22f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 219.22f),
                    PathNode.CurveTo(181.26048f, 213.72092f, 213.72092f, 181.26048f, 219.22f, 140.0f),
                    PathNode.LineTo(240.0f, 140.0f),
                    PathNode.CurveTo(246.62741f, 140.0f, 252.0f, 134.62741f, 252.0f, 128.0f),
                    PathNode.CurveTo(252.0f, 121.37258f, 246.62741f, 116.0f, 240.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 196.0f),
                    PathNode.CurveTo(90.44463f, 196.0f, 60.0f, 165.55536f, 60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 90.44463f, 90.44463f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(165.55536f, 60.0f, 196.0f, 90.44463f, 196.0f, 128.0f),
                    PathNode.CurveTo(195.96141f, 165.53935f, 165.53935f, 195.96141f, 128.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(116.95431f, 148.0f, 108.0f, 139.0457f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 116.95431f, 116.95431f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(139.0457f, 108.0f, 148.0f, 116.95431f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 139.0457f, 139.0457f, 148.0f, 128.0f, 148.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gpsFix!!
    }

private var _gpsFix: ImageVector? = null
