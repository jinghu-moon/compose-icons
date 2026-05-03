package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Baseball: ImageVector
    get() {
        if (_baseball != null) return _baseball!!
        _baseball = phosphorThinIcon(
            name = "Baseball",
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
                    PathNode.MoveTo(195.31f, 190.64f),
                    PathNode.CurveTo(193.76f, 188.98f, 192.26f, 187.26f, 190.85f, 185.5f),
                    PathNode.CurveTo(189.44704f, 183.85698f, 186.9929f, 183.62497f, 185.30688f, 184.97595f),
                    PathNode.CurveTo(183.62086f, 186.32692f, 183.31233f, 188.77261f, 184.61f, 190.5f),
                    PathNode.CurveTo(186.19f, 192.5f, 187.87f, 194.4f, 189.61f, 196.26f),
                    PathNode.CurveTo(154.63423f, 227.91104f, 101.365776f, 227.91104f, 66.39f, 196.26f),
                    PathNode.CurveTo(68.13f, 194.4f, 69.81f, 192.48f, 71.39f, 190.5f),
                    PathNode.CurveTo(72.687675f, 188.77261f, 72.37914f, 186.32692f, 70.69312f, 184.97595f),
                    PathNode.CurveTo(69.007095f, 183.62497f, 66.55296f, 183.85698f, 65.15f, 185.5f),
                    PathNode.CurveTo(63.74f, 187.26f, 62.24f, 188.98f, 60.69f, 190.64f),
                    PathNode.CurveTo(27.772106f, 155.36699f, 27.772106f, 100.633f, 60.69f, 65.36f),
                    PathNode.CurveTo(62.24f, 67.02f, 63.74f, 68.74f, 65.15f, 70.5f),
                    PathNode.CurveTo(66.55296f, 72.14301f, 69.007095f, 72.37503f, 70.69312f, 71.024055f),
                    PathNode.CurveTo(72.37914f, 69.67307f, 72.687675f, 67.22739f, 71.39f, 65.5f),
                    PathNode.CurveTo(69.81f, 63.5f, 68.13f, 61.6f, 66.39f, 59.74f),
                    PathNode.CurveTo(101.365776f, 28.088957f, 154.63423f, 28.088957f, 189.61f, 59.74f),
                    PathNode.CurveTo(187.87f, 61.6f, 186.19f, 63.52f, 184.61f, 65.5f),
                    PathNode.CurveTo(183.66266f, 66.60942f, 183.39445f, 68.146614f, 183.9101f, 69.5113f),
                    PathNode.CurveTo(184.42575f, 70.87599f, 185.64346f, 71.85172f, 187.08774f, 72.05749f),
                    PathNode.CurveTo(188.53201f, 72.263245f, 189.97377f, 71.66639f, 190.85f, 70.5f),
                    PathNode.CurveTo(192.26f, 68.74f, 193.76f, 67.02f, 195.31f, 65.36f),
                    PathNode.CurveTo(228.22789f, 100.633f, 228.22789f, 155.36699f, 195.31f, 190.64f),
                    PathNode.Close,
                    PathNode.MoveTo(91.94f, 144.64f),
                    PathNode.CurveTo(90.99558f, 150.31145f, 89.55676f, 155.88937f, 87.64f, 161.31f),
                    PathNode.CurveTo(87.0818f, 162.92043f, 85.56443f, 164.00026f, 83.86f, 164.0f),
                    PathNode.CurveTo(83.40663f, 164.00163f, 82.95649f, 163.92378f, 82.53f, 163.77f),
                    PathNode.CurveTo(80.44879f, 163.03445f, 79.35682f, 160.75204f, 80.09f, 158.67f),
                    PathNode.CurveTo(81.861336f, 153.68442f, 83.19962f, 148.55544f, 84.09f, 143.34f),
                    PathNode.CurveTo(84.54767f, 141.25911f, 86.55612f, 139.90218f, 88.65747f, 140.25418f),
                    PathNode.CurveTo(90.75883f, 140.60619f, 92.21544f, 142.54355f, 91.97f, 144.66f),
                    PathNode.Close,
                    PathNode.MoveTo(91.94f, 111.32f),
                    PathNode.CurveTo(92.301544f, 113.495316f, 90.83439f, 115.55291f, 88.66f, 115.92f),
                    PathNode.CurveTo(88.44279f, 115.96605f, 88.22192f, 115.99282f, 88.0f, 116.0f),
                    PathNode.CurveTo(86.04752f, 115.997475f, 84.38216f, 114.58572f, 84.06f, 112.66f),
                    PathNode.CurveTo(83.16962f, 107.44456f, 81.83134f, 102.315575f, 80.06f, 97.33f),
                    PathNode.CurveTo(79.32546f, 95.245125f, 80.42013f, 92.95954f, 82.505f, 92.225f),
                    PathNode.CurveTo(84.589874f, 91.49046f, 86.87546f, 92.58513f, 87.61f, 94.67f),
                    PathNode.CurveTo(89.53696f, 100.08968f, 90.98582f, 105.66764f, 91.94f, 111.34f),
                    PathNode.Close,
                    PathNode.MoveTo(175.94f, 158.65f),
                    PathNode.CurveTo(176.67319f, 160.73204f, 175.5812f, 163.01445f, 173.5f, 163.75f),
                    PathNode.CurveTo(173.0735f, 163.90378f, 172.62337f, 163.98163f, 172.17f, 163.98f),
                    PathNode.CurveTo(170.47078f, 163.98322f, 168.95499f, 162.91254f, 168.39f, 161.31f),
                    PathNode.CurveTo(166.47324f, 155.88937f, 165.03441f, 150.31145f, 164.09f, 144.64f),
                    PathNode.CurveTo(163.84456f, 142.52356f, 165.30118f, 140.58618f, 167.40253f, 140.23418f),
                    PathNode.CurveTo(169.50388f, 139.88217f, 171.51233f, 141.2391f, 171.97f, 143.32f),
                    PathNode.CurveTo(172.83972f, 148.54039f, 174.15793f, 153.67609f, 175.91f, 158.67f),
                    PathNode.Close,
                    PathNode.MoveTo(175.94f, 97.31f),
                    PathNode.CurveTo(174.16867f, 102.29558f, 172.83038f, 107.42456f, 171.94f, 112.64f),
                    PathNode.CurveTo(171.62659f, 114.57366f, 169.9589f, 115.99585f, 168.0f, 116.0f),
                    PathNode.CurveTo(167.77864f, 115.99989f, 167.55775f, 115.97981f, 167.34f, 115.94f),
                    PathNode.CurveTo(165.16562f, 115.572914f, 163.69844f, 113.51532f, 164.06f, 111.34f),
                    PathNode.CurveTo(165.00441f, 105.66856f, 166.44324f, 100.09062f, 168.36f, 94.67f),
                    PathNode.CurveTo(169.09454f, 92.58513f, 171.38013f, 91.49046f, 173.465f, 92.225f),
                    PathNode.CurveTo(175.54988f, 92.95954f, 176.64453f, 95.245125f, 175.91f, 97.33f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _baseball!!
    }

private var _baseball: ImageVector? = null
