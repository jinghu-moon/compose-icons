package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NumberCircleEight: ImageVector
    get() {
        if (_numberCircleEight != null) return _numberCircleEight!!
        _numberCircleEight = phosphorThinIcon(
            name = "NumberCircleEight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(142.9f, 123.69f),
                    PathNode.CurveTo(153.46451f, 117.04995f, 158.3603f, 104.220566f, 154.90518f, 92.230515f),
                    PathNode.CurveTo(151.45006f, 80.24047f, 140.47794f, 71.98367f, 128.0f, 71.98367f),
                    PathNode.CurveTo(115.52206f, 71.98367f, 104.54994f, 80.24047f, 101.094826f, 92.230515f),
                    PathNode.CurveTo(97.6397f, 104.220566f, 102.535484f, 117.04995f, 113.1f, 123.69f),
                    PathNode.CurveTo(100.07548f, 130.54272f, 93.40441f, 145.39554f, 96.93377f, 159.68335f),
                    PathNode.CurveTo(100.46312f, 173.97119f, 113.28272f, 184.00943f, 128.0f, 184.00943f),
                    PathNode.CurveTo(142.71727f, 184.00943f, 155.53688f, 173.97119f, 159.06624f, 159.68335f),
                    PathNode.CurveTo(162.59558f, 145.39554f, 155.92453f, 130.54272f, 142.9f, 123.69f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 100.0f),
                    PathNode.CurveTo(108.0f, 88.95431f, 116.95431f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(139.0457f, 80.0f, 148.0f, 88.95431f, 148.0f, 100.0f),
                    PathNode.CurveTo(148.0f, 111.04569f, 139.0457f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(116.95431f, 120.0f, 108.0f, 111.04569f, 108.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(114.74516f, 176.0f, 104.0f, 165.25484f, 104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 138.74516f, 114.74516f, 128.0f, 128.0f, 128.0f),
                    PathNode.CurveTo(141.25484f, 128.0f, 152.0f, 138.74516f, 152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 165.25484f, 141.25484f, 176.0f, 128.0f, 176.0f),
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
        return _numberCircleEight!!
    }

private var _numberCircleEight: ImageVector? = null
