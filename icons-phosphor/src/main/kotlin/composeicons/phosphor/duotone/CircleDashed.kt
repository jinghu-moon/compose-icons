package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) return _circleDashed!!
        _circleDashed = phosphorDuotoneIcon(
            name = "CircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c0 53.019-42.981 96-96 96C74.981 224 32 181.019 32 128 32 74.981 74.981 32 128 32c53.019 0 96 42.981 96 96Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M96.26 37C95.178 32.736 97.742 28.398 102 27.29c17.054-4.398 34.946-4.398 52 0 3.909 1.001 6.46 4.755 5.952 8.758-.508 4.002-3.917 7-7.952 6.992-.675-.004-1.347-.091-2-.26-14.431-3.722-29.569-3.722-44 0-2.058 .528-4.242 .215-6.069-.87C98.104 40.826 96.783 39.059 96.26 37ZM53.79 55.14c-12.335 12.558-21.281 28.041-26 45-.818 2.773-.076 5.771 1.941 7.843 2.016 2.072 4.994 2.894 7.788 2.151 2.794-.743 4.97-2.935 5.692-5.734 3.989-14.352 11.559-27.456 22-38.08 2.836-3.19 2.668-8.046-.382-11.032C61.777 52.302 56.919 52.237 53.79 55.14ZM43.21 151.55c-1.182-4.258-5.592-6.752-9.85-5.57-4.258 1.182-6.752 5.592-5.57 9.85 4.719 16.959 13.665 32.442 26 45 1.985 2.12 4.962 2.998 7.78 2.293 2.817-.704 5.032-2.88 5.786-5.684 .754-2.804-.071-5.797-2.155-7.819C54.772 178.991 47.207 165.894 43.21 151.55ZM150 213.22c-14.43 3.726-29.57 3.726-44 0-2.784-.765-5.764 .03-7.798 2.08-2.033 2.05-2.805 5.036-2.018 7.814 .787 2.778 3.009 4.917 5.816 5.596 17.054 4.398 34.946 4.398 52 0 4.215-1.157 6.72-5.483 5.627-9.715-1.093-4.232-5.379-6.803-9.627-5.775ZM222.65 146c-2.045-.568-4.232-.3-6.079 .744-1.847 1.045-3.204 2.781-3.771 4.826-3.986 14.356-11.556 27.464-22 38.09-3.096 3.154-3.049 8.219 .105 11.315 3.154 3.096 8.219 3.049 11.315-.105 12.334-12.559 21.279-28.042 26-45 .574-2.048 .309-4.239-.736-6.091-1.045-1.852-2.785-3.212-4.834-3.779ZM212.79 104.46c1.182 4.258 5.592 6.752 9.85 5.57 4.258-1.182 6.752-5.592 5.57-9.85-4.719-16.959-13.665-32.442-26-45-1.985-2.12-4.962-2.998-7.78-2.293-2.817 .704-5.032 2.88-5.786 5.684-.754 2.804 .071 5.797 2.155 7.819 10.427 10.626 17.992 23.72 21.99 38.06Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
