package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) return _codesandboxLogo!!
        _codesandboxLogo = phosphorThinIcon(
            name = "CodesandboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(221.76f, 69.66f),
                    PathNode.LineTo(133.76f, 21.48f),
                    PathNode.CurveTo(130.17105f, 19.516296f, 125.82895f, 19.516296f, 122.24f, 21.48f),
                    PathNode.LineTo(34.24f, 69.66f),
                    PathNode.CurveTo(30.394829f, 71.76389f, 28.002638f, 75.79688f, 28.0f, 80.18f),
                    PathNode.LineTo(28.0f, 175.82f),
                    PathNode.CurveTo(28.002638f, 180.20311f, 30.394829f, 184.2361f, 34.24f, 186.34f),
                    PathNode.LineTo(122.24f, 234.52f),
                    PathNode.CurveTo(125.826546f, 236.49307f, 130.17345f, 236.49307f, 133.76f, 234.52f),
                    PathNode.LineTo(221.76f, 186.34f),
                    PathNode.CurveTo(225.60518f, 184.2361f, 227.99736f, 180.20311f, 228.0f, 175.82f),
                    PathNode.LineTo(228.0f, 80.18f),
                    PathNode.CurveTo(227.99736f, 75.79688f, 225.60518f, 71.76389f, 221.76f, 69.66f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 123.44f),
                    PathNode.LineTo(40.33f, 75.44f),
                    PathNode.LineTo(83.14f, 52.0f),
                    PathNode.LineTo(126.08f, 75.5f),
                    PathNode.CurveTo(127.27631f, 76.15457f, 128.72368f, 76.15457f, 129.92f, 75.5f),
                    PathNode.LineTo(172.86f, 52.0f),
                    PathNode.LineTo(215.67f, 75.43f),
                    PathNode.Close,
                    PathNode.MoveTo(126.08f, 28.5f),
                    PathNode.CurveTo(127.27338f, 27.83403f, 128.72662f, 27.83403f, 129.92f, 28.5f),
                    PathNode.LineTo(164.53f, 47.5f),
                    PathNode.LineTo(128.0f, 67.44f),
                    PathNode.LineTo(91.47f, 47.44f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 175.82f),
                    PathNode.LineTo(36.0f, 132.47f),
                    PathNode.LineTo(76.0f, 154.37f),
                    PathNode.LineTo(76.0f, 200.09f),
                    PathNode.LineTo(38.08f, 179.33f),
                    PathNode.CurveTo(36.79723f, 178.62813f, 35.99966f, 177.28223f, 36.0f, 175.82f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 204.47f),
                    PathNode.LineTo(84.0f, 152.0f),
                    PathNode.CurveTo(84.000336f, 150.53777f, 83.202774f, 149.19188f, 81.92f, 148.49f),
                    PathNode.LineTo(36.0f, 123.35f),
                    PathNode.LineTo(36.0f, 82.19f),
                    PathNode.LineTo(124.0f, 130.37f),
                    PathNode.LineTo(124.0f, 226.37f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 226.36f),
                    PathNode.LineTo(132.0f, 130.36f),
                    PathNode.LineTo(220.0f, 82.18f),
                    PathNode.LineTo(220.0f, 123.34f),
                    PathNode.LineTo(174.08f, 148.48f),
                    PathNode.CurveTo(172.79408f, 149.1836f, 171.996f, 150.53418f, 172.0f, 152.0f),
                    PathNode.LineTo(172.0f, 204.47f),
                    PathNode.Close,
                    PathNode.MoveTo(217.92f, 179.36f),
                    PathNode.LineTo(180.0f, 200.09f),
                    PathNode.LineTo(180.0f, 154.37f),
                    PathNode.LineTo(220.0f, 132.47f),
                    PathNode.LineTo(220.0f, 175.82f),
                    PathNode.CurveTo(220.00034f, 177.28223f, 219.20277f, 178.62813f, 217.92f, 179.33f),
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
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
