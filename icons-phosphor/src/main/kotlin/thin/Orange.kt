package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Orange: ImageVector
    get() {
        if (_orange != null) return _orange!!
        _orange = phosphorThinIcon(
            name = "Orange",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(155.62f, 72.69f),
                    PathNode.CurveTo(179.76768f, 64.30551f, 195.96786f, 41.561874f, 196.0f, 16.0f),
                    PathNode.CurveTo(196.0f, 13.790861f, 194.20914f, 12.0f, 192.0f, 12.0f),
                    PathNode.LineTo(184.0f, 12.0f),
                    PathNode.CurveTo(159.17218f, 12.032007f, 136.92049f, 27.330048f, 128.0f, 50.5f),
                    PathNode.CurveTo(119.07951f, 27.330048f, 96.82781f, 12.032007f, 72.0f, 12.0f),
                    PathNode.LineTo(64.0f, 12.0f),
                    PathNode.CurveTo(61.79086f, 12.0f, 60.0f, 13.790861f, 60.0f, 16.0f),
                    PathNode.CurveTo(60.0f, 18.209139f, 61.79086f, 20.0f, 64.0f, 20.0f),
                    PathNode.LineTo(72.0f, 20.0f),
                    PathNode.CurveTo(99.192856f, 20.03653f, 121.776794f, 40.995502f, 123.84f, 68.11f),
                    PathNode.CurveTo(80.62406f, 70.2368f, 46.093525f, 104.84323f, 44.061607f, 148.06372f),
                    PathNode.CurveTo(42.029682f, 191.28424f, 73.161194f, 228.97763f, 115.98699f, 235.1495f),
                    PathNode.CurveTo(158.81279f, 241.32138f, 199.32082f, 213.95238f, 209.57562f, 171.91692f),
                    PathNode.CurveTo(219.83044f, 129.88147f, 196.47679f, 86.933014f, 155.62f, 72.69f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 20.0f),
                    PathNode.LineTo(187.85f, 20.0f),
                    PathNode.CurveTo(185.72742f, 47.0726f, 163.15567f, 67.968346f, 136.0f, 68.0f),
                    PathNode.LineTo(132.15f, 68.0f),
                    PathNode.CurveTo(134.27258f, 40.9274f, 156.84433f, 20.031654f, 184.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 228.0f),
                    PathNode.CurveTo(86.02636f, 228.0f, 52.0f, 193.97365f, 52.0f, 152.0f),
                    PathNode.CurveTo(52.0f, 110.02636f, 86.02636f, 76.0f, 128.0f, 76.0f),
                    PathNode.CurveTo(169.97365f, 76.0f, 204.0f, 110.02636f, 204.0f, 152.0f),
                    PathNode.CurveTo(203.9559f, 193.95538f, 169.95538f, 227.9559f, 128.0f, 228.0f),
                    PathNode.Close,
                    PathNode.MoveTo(179.94f, 160.66f),
                    PathNode.CurveTo(176.0419f, 182.75975f, 158.75433f, 200.07129f, 136.66f, 204.0f),
                    PathNode.CurveTo(136.44135f, 204.03122f, 136.22084f, 204.04791f, 136.0f, 204.05f),
                    PathNode.CurveTo(133.90761f, 204.06583f, 132.15659f, 202.46634f, 131.98347f, 200.38106f),
                    PathNode.CurveTo(131.81035f, 198.29576f, 133.27364f, 196.42944f, 135.34f, 196.1f),
                    PathNode.CurveTo(154.06998f, 192.77986f, 168.73476f, 178.11908f, 172.06f, 159.39f),
                    PathNode.CurveTo(172.23018f, 157.92253f, 173.19534f, 156.66833f, 174.57027f, 156.12798f),
                    PathNode.CurveTo(175.94519f, 155.58762f, 177.50603f, 155.84908f, 178.6298f, 156.808f),
                    PathNode.CurveTo(179.75359f, 157.76692f, 180.25732f, 159.26718f, 179.94f, 160.71f),
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
        return _orange!!
    }

private var _orange: ImageVector? = null
