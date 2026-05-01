package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorFillIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 140.0f),
                    PathNode.CurveTo(80.0f, 133.37259f, 85.37258f, 128.0f, 92.0f, 128.0f),
                    PathNode.CurveTo(98.62742f, 128.0f, 104.0f, 133.37259f, 104.0f, 140.0f),
                    PathNode.CurveTo(104.0f, 146.62741f, 98.62742f, 152.0f, 92.0f, 152.0f),
                    PathNode.CurveTo(85.37258f, 152.0f, 80.0f, 146.62741f, 80.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.66f, 188.43f),
                    PathNode.CurveTo(156.21297f, 192.1076f, 151.24835f, 193.10591f, 147.57f, 190.66f),
                    PathNode.CurveTo(141.07f, 186.34f, 136.0f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(120.0f, 184.0f, 114.93f, 186.34f, 108.43f, 190.66f),
                    PathNode.CurveTo(104.75491f, 193.01305f, 99.8721f, 191.98679f, 97.45525f, 188.35333f),
                    PathNode.CurveTo(95.038414f, 184.71988f, 95.979294f, 179.8199f, 99.57f, 177.34f),
                    PathNode.CurveTo(108.0f, 171.73f, 116.06f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(139.94f, 168.0f, 148.0f, 171.73f, 156.43f, 177.34f),
                    PathNode.CurveTo(160.1076f, 179.78703f, 161.10591f, 184.75165f, 158.66f, 188.43f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(157.37259f, 152.0f, 152.0f, 146.62741f, 152.0f, 140.0f),
                    PathNode.CurveTo(152.0f, 133.37259f, 157.37259f, 128.0f, 164.0f, 128.0f),
                    PathNode.CurveTo(170.62741f, 128.0f, 176.0f, 133.37259f, 176.0f, 140.0f),
                    PathNode.CurveTo(176.0f, 146.62741f, 170.62741f, 152.0f, 164.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.44f, 94.66f),
                    PathNode.LineTo(132.44f, 126.66f),
                    PathNode.CurveTo(129.75171f, 128.4536f, 126.2483f, 128.4536f, 123.56f, 126.66f),
                    PathNode.LineTo(75.56f, 94.66f),
                    PathNode.CurveTo(71.88178f, 92.207855f, 70.887856f, 87.23822f, 73.34f, 83.56f),
                    PathNode.CurveTo(75.792145f, 79.88178f, 80.76178f, 78.887856f, 84.44f, 81.34f),
                    PathNode.LineTo(128.0f, 110.39f),
                    PathNode.LineTo(171.56f, 81.39f),
                    PathNode.CurveTo(175.23822f, 78.93786f, 180.20786f, 79.931786f, 182.66f, 83.61f),
                    PathNode.CurveTo(185.11214f, 87.288216f, 184.11821f, 92.25786f, 180.44f, 94.71f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
