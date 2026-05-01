package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorLightIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.72f, 67.91f),
                    PathNode.LineTo(134.72f, 19.73f),
                    PathNode.CurveTo(130.53772f, 17.420195f, 125.46228f, 17.420195f, 121.28f, 19.73f),
                    PathNode.LineTo(33.28f, 67.9f),
                    PathNode.CurveTo(28.791872f, 70.35569f, 26.000643f, 75.06397f, 26.0f, 80.18f),
                    PathNode.LineTo(26.0f, 175.82f),
                    PathNode.CurveTo(26.000643f, 180.93602f, 28.791872f, 185.6443f, 33.28f, 188.1f),
                    PathNode.LineTo(121.28f, 236.27f),
                    PathNode.CurveTo(125.46325f, 238.57602f, 130.53674f, 238.57602f, 134.72f, 236.27f),
                    PathNode.LineTo(222.72f, 188.1f),
                    PathNode.CurveTo(227.20813f, 185.6443f, 229.99936f, 180.93602f, 230.0f, 175.82f),
                    PathNode.LineTo(230.0f, 80.18f),
                    PathNode.CurveTo(229.99571f, 75.06756f, 227.20499f, 70.36397f, 222.72f, 67.91f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 121.16f),
                    PathNode.LineTo(44.49f, 75.44f),
                    PathNode.LineTo(83.14f, 54.29f),
                    PathNode.LineTo(125.14f, 77.29f),
                    PathNode.CurveTo(126.93447f, 78.27185f, 129.10553f, 78.27185f, 130.9f, 77.29f),
                    PathNode.LineTo(172.9f, 54.29f),
                    PathNode.LineTo(211.55f, 75.44f),
                    PathNode.Close,
                    PathNode.MoveTo(127.0f, 30.25f),
                    PathNode.CurveTo(127.59816f, 29.922716f, 128.32184f, 29.922716f, 128.92f, 30.25f),
                    PathNode.LineTo(160.32f, 47.45f),
                    PathNode.LineTo(128.0f, 65.16f),
                    PathNode.LineTo(95.63f, 47.45f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 175.82f),
                    PathNode.LineTo(38.0f, 135.82f),
                    PathNode.LineTo(74.0f, 155.52f),
                    PathNode.LineTo(74.0f, 196.68f),
                    PathNode.LineTo(39.0f, 177.57f),
                    PathNode.CurveTo(38.37561f, 177.20955f, 37.993546f, 176.54094f, 38.0f, 175.82f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 203.28f),
                    PathNode.LineTo(86.0f, 152.0f),
                    PathNode.CurveTo(85.99868f, 149.80844f, 84.80259f, 147.79195f, 82.88f, 146.74f),
                    PathNode.LineTo(38.0f, 122.17f),
                    PathNode.LineTo(38.0f, 85.57f),
                    PathNode.LineTo(122.0f, 131.57f),
                    PathNode.LineTo(122.0f, 223.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 223.0f),
                    PathNode.LineTo(134.0f, 131.56f),
                    PathNode.LineTo(218.0f, 85.56f),
                    PathNode.LineTo(218.0f, 122.16f),
                    PathNode.LineTo(173.12f, 146.73f),
                    PathNode.CurveTo(171.19427f, 147.78366f, 169.99767f, 149.80486f, 170.0f, 152.0f),
                    PathNode.LineTo(170.0f, 203.28f),
                    PathNode.Close,
                    PathNode.MoveTo(217.0f, 177.58f),
                    PathNode.LineTo(182.0f, 196.72f),
                    PathNode.LineTo(182.0f, 155.55f),
                    PathNode.LineTo(218.0f, 135.85f),
                    PathNode.LineTo(218.0f, 175.85f),
                    PathNode.CurveTo(217.99571f, 176.56023f, 217.61508f, 177.21489f, 217.0f, 177.57f),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
