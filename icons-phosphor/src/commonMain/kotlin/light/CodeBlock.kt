package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CodeBlock: ImageVector
    get() {
        if (_codeBlock != null) return _codeBlock!!
        _codeBlock = phosphorLightIcon(
            name = "CodeBlock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(59.76f, 100.24f),
                    PathNode.LineTo(27.76f, 68.24f),
                    PathNode.CurveTo(25.420374f, 65.89746f, 25.420374f, 62.10254f, 27.76f, 59.76f),
                    PathNode.LineTo(59.76f, 27.76f),
                    PathNode.CurveTo(61.255764f, 26.154774f, 63.508446f, 25.494007f, 65.63431f, 26.036915f),
                    PathNode.CurveTo(67.76018f, 26.579824f, 69.42017f, 28.239822f, 69.96308f, 30.365688f),
                    PathNode.CurveTo(70.506f, 32.491554f, 69.84522f, 34.744236f, 68.24f, 36.24f),
                    PathNode.LineTo(40.49f, 64.0f),
                    PathNode.LineTo(68.24f, 91.76f),
                    PathNode.CurveTo(69.84522f, 93.25577f, 70.506f, 95.508446f, 69.96308f, 97.6343f),
                    PathNode.CurveTo(69.42017f, 99.76018f, 67.76018f, 101.42017f, 65.63431f, 101.96308f),
                    PathNode.CurveTo(63.508446f, 102.506f, 61.255764f, 101.84522f, 59.76f, 100.24f),
                    PathNode.Close,
                    PathNode.MoveTo(99.76f, 100.24f),
                    PathNode.CurveTo(102.10254f, 102.57962f, 105.89746f, 102.57962f, 108.24f, 100.24f),
                    PathNode.LineTo(140.24f, 68.24f),
                    PathNode.CurveTo(142.57962f, 65.89746f, 142.57962f, 62.10254f, 140.24f, 59.76f),
                    PathNode.LineTo(108.24f, 27.76f),
                    PathNode.CurveTo(106.74423f, 26.154774f, 104.491554f, 25.494007f, 102.3657f, 26.036915f),
                    PathNode.CurveTo(100.23982f, 26.579824f, 98.57983f, 28.239822f, 98.03692f, 30.365688f),
                    PathNode.CurveTo(97.494f, 32.491554f, 98.15478f, 34.744236f, 99.76f, 36.24f),
                    PathNode.LineTo(127.51f, 64.0f),
                    PathNode.LineTo(99.76f, 91.76f),
                    PathNode.CurveTo(97.42038f, 94.10254f, 97.42038f, 97.89746f, 99.76f, 100.24f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 42.0f),
                    PathNode.LineTo(176.0f, 42.0f),
                    PathNode.CurveTo(172.6863f, 42.0f, 170.0f, 44.68629f, 170.0f, 48.0f),
                    PathNode.CurveTo(170.0f, 51.31371f, 172.6863f, 54.0f, 176.0f, 54.0f),
                    PathNode.LineTo(200.0f, 54.0f),
                    PathNode.CurveTo(201.10457f, 54.0f, 202.0f, 54.89543f, 202.0f, 56.0f),
                    PathNode.LineTo(202.0f, 200.0f),
                    PathNode.CurveTo(202.0f, 201.10457f, 201.10457f, 202.0f, 200.0f, 202.0f),
                    PathNode.LineTo(56.0f, 202.0f),
                    PathNode.CurveTo(54.89543f, 202.0f, 54.0f, 201.10457f, 54.0f, 200.0f),
                    PathNode.LineTo(54.0f, 136.0f),
                    PathNode.CurveTo(54.0f, 132.6863f, 51.31371f, 130.0f, 48.0f, 130.0f),
                    PathNode.CurveTo(44.68629f, 130.0f, 42.0f, 132.6863f, 42.0f, 136.0f),
                    PathNode.LineTo(42.0f, 200.0f),
                    PathNode.CurveTo(42.0f, 207.73198f, 48.268013f, 214.0f, 56.0f, 214.0f),
                    PathNode.LineTo(200.0f, 214.0f),
                    PathNode.CurveTo(207.73198f, 214.0f, 214.0f, 207.73198f, 214.0f, 200.0f),
                    PathNode.LineTo(214.0f, 56.0f),
                    PathNode.CurveTo(214.0f, 48.268013f, 207.73198f, 42.0f, 200.0f, 42.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _codeBlock!!
    }

private var _codeBlock: ImageVector? = null
