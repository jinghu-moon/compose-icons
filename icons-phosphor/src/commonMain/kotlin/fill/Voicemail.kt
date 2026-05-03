package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorFillIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 72.0f),
                    PathNode.CurveTo(177.25551f, 72.02104f, 156.78296f, 85.79667f, 148.19609f, 106.85797f),
                    PathNode.CurveTo(139.60922f, 127.919266f, 144.61392f, 152.08217f, 160.86f, 168.0f),
                    PathNode.LineTo(95.14f, 168.0f),
                    PathNode.CurveTo(114.264824f, 149.26155f, 117.44969f, 119.6067f, 102.74005f, 97.23451f),
                    PathNode.CurveTo(88.030426f, 74.86232f, 59.542034f, 66.03252f, 34.758114f, 76.16391f),
                    PathNode.CurveTo(9.974184f, 86.2953f, -4.170761f, 112.55315f, 1.003976f, 138.8231f),
                    PathNode.CurveTo(6.178714f, 165.09306f, 29.225245f, 184.0248f, 56.0f, 184.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(230.92795f, 184.0f, 256.0f, 158.92795f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 97.07206f, 230.92795f, 72.0f, 200.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 168.0f),
                    PathNode.CurveTo(33.90861f, 168.0f, 16.0f, 150.09138f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 105.90861f, 33.90861f, 88.0f, 56.0f, 88.0f),
                    PathNode.CurveTo(78.09139f, 88.0f, 96.0f, 105.90861f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 150.09138f, 78.09139f, 168.0f, 56.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 168.0f),
                    PathNode.CurveTo(177.90862f, 168.0f, 160.0f, 150.09138f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 105.90861f, 177.90862f, 88.0f, 200.0f, 88.0f),
                    PathNode.CurveTo(222.09138f, 88.0f, 240.0f, 105.90861f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 150.09138f, 222.09138f, 168.0f, 200.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 141.25484f, 213.25484f, 152.0f, 200.0f, 152.0f),
                    PathNode.CurveTo(186.74516f, 152.0f, 176.0f, 141.25484f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 114.74516f, 186.74516f, 104.0f, 200.0f, 104.0f),
                    PathNode.CurveTo(213.25484f, 104.0f, 224.0f, 114.74516f, 224.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 141.25484f, 69.25484f, 152.0f, 56.0f, 152.0f),
                    PathNode.CurveTo(42.745167f, 152.0f, 32.0f, 141.25484f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 114.74516f, 42.745167f, 104.0f, 56.0f, 104.0f),
                    PathNode.CurveTo(69.25484f, 104.0f, 80.0f, 114.74516f, 80.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
