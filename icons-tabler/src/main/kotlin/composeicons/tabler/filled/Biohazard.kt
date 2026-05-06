package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Biohazard: ImageVector
    get() {
        if (_biohazard != null) return _biohazard!!
        _biohazard = tablerFilledIcon(
            name = "Biohazard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.41 2.072c1.672 1.671 2.258 4.143 1.514 6.387l-.051 .137 .223 .044q.325 .072 .645 .18l.318 .117 .25 .105c2.155 .97 3.572 3.067 3.681 5.483v.217c-.001 .828-.673 1.499-1.501 1.498-.828-.001-1.499-.673-1.499-1.501l.002-.145c-.048-1.043-.594-2-1.468-2.572-.874-.572-1.97-.689-2.944-.314l-.091 .037 .004 .038 .007 .217c0 1.278-.696 2.455-1.817 3.07l-.16 .082 .014 .11c.082 .511 .285 .997 .595 1.416l.14 .175c.571 .671 1.391 1.081 2.27 1.136l.203 .006c.828 0 1.5 .672 1.5 1.5 0 .828-.672 1.5-1.5 1.5-1.735 0-3.393-.721-4.575-1.991l-.177-.199-.078 .092c-1.016 1.136-2.409 1.866-3.921 2.054l-.273 .028-.259 .016h-.217C6.417 20.994 5.746 20.322 5.747 19.493c.001-.828 .673-1.499 1.502-1.498l.145 .002c1.572-.072 2.867-1.26 3.074-2.82l.003-.03-.161-.083C9.25 14.479 8.568 13.389 8.505 12.181l-.005-.195 .006-.191 .003-.043-.075-.032c-.771-.303-1.629-.3-2.398 .008l-.191 .084c-1.13 .54-1.85 1.681-1.85 2.933 0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5C.995 11.762 3.104 9.194 6.031 8.615l.077-.014L6.058 8.458 5.978 8.198 5.912 7.948C5.432 5.929 5.982 3.803 7.382 2.27l.163-.172c.368-.397 .921-.565 1.447-.44 .526 .125 .945 .524 1.095 1.044 .15 .52 .008 1.08-.371 1.466l-.137 .143c-.602 .666-.902 1.551-.829 2.445 .073 .895 .513 1.719 1.215 2.278l.084 .062 .05-.034c.501-.325 1.077-.516 1.673-.555L12 8.5c.683 0 1.336 .197 1.894 .556l.048 .033 .067-.048c.537-.425 .926-1.009 1.111-1.669l.05-.2c.215-1.007-.059-2.056-.74-2.828l-.141-.15c-.39-.376-.547-.934-.41-1.459 .137-.525 .546-.934 1.071-1.072 .524-.138 1.082 .019 1.459 .408"),
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
        return _biohazard!!
    }

private var _biohazard: ImageVector? = null
