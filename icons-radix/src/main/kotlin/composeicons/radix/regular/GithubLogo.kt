package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.GithubLogo: ImageVector
    get() {
        if (_githubLogo != null) return _githubLogo!!
        _githubLogo = radixIcon(
            name = "GithubLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.499 .25c4.004 0 7.251 3.246 7.251 7.25 0 3.202-2.075 5.918-4.954 6.879-.367 .071-.498-.155-.498-.349 0-.238 .009-1.02 .009-1.989-0-.676-.232-1.119-.492-1.343 1.615-.179 3.311-.792 3.311-3.577 0-.792-.281-1.438-.745-1.945 .074-.183 .322-.921-.073-1.919C11.292 3.252 10.682 3.074 9.315 4 8.736 3.839 8.116 3.759 7.5 3.756 6.884 3.759 6.264 3.839 5.686 4 4.3 3.062 3.691 3.257 3.691 3.257c-.395 .998-.146 1.736-.071 1.919-.464 .507-.746 1.154-.746 1.945 0 2.778 1.693 3.4 3.303 3.583-.207 .181-.394 .501-.46 .969-.413 .186-1.464 .506-2.11-.602 0 0-.383-.696-1.11-.747 0 0-.708-.009-.05 .44 .014 .007 .48 .236 .805 1.061 .005 .015 .437 1.407 2.442 .972 .004 .605 .01 1.061 .01 1.233-0 .192-.133 .416-.495 .35C2.327 13.421 .25 10.703 .25 7.5 .25 3.496 3.496 .25 7.499 .25Z"),
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
        return _githubLogo!!
    }

private var _githubLogo: ImageVector? = null
