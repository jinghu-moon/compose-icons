package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Microphone: ImageVector
    get() {
        if (_microphone != null) return _microphone!!
        _microphone = phosphorRegularIcon(
            name = "Microphone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(154.49825f, 175.97244f, 175.97244f, 154.49825f, 176.0f, 128.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(176.0f, 37.490334f, 154.50967f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(101.49033f, 16.0f, 80.0f, 37.490334f, 80.0f, 64.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.CurveTo(80.02756f, 154.49825f, 101.501755f, 175.97244f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 46.32689f, 110.32689f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(145.67311f, 32.0f, 160.0f, 46.32689f, 160.0f, 64.0f),
                    PathNode.LineTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 207.6f),
                    PathNode.LineTo(136.0f, 240.0f),
                    PathNode.CurveTo(136.0f, 244.41827f, 132.41827f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(123.58172f, 248.0f, 120.0f, 244.41827f, 120.0f, 240.0f),
                    PathNode.LineTo(120.0f, 207.6f),
                    PathNode.CurveTo(79.14537f, 203.44272f, 48.05046f, 169.06557f, 48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 123.58172f, 51.581722f, 120.0f, 56.0f, 120.0f),
                    PathNode.CurveTo(60.418278f, 120.0f, 64.0f, 123.58172f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 163.34622f, 92.65378f, 192.0f, 128.0f, 192.0f),
                    PathNode.CurveTo(163.34622f, 192.0f, 192.0f, 163.34622f, 192.0f, 128.0f),
                    PathNode.CurveTo(192.0f, 123.58172f, 195.58173f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 123.58172f, 208.0f, 128.0f),
                    PathNode.CurveTo(207.94954f, 169.06557f, 176.85463f, 203.44272f, 136.0f, 207.6f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microphone!!
    }

private var _microphone: ImageVector? = null
